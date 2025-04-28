package com.sentinel.smarter.modules.supplies.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.supplies.models.Item;
import com.sentinel.smarter.modules.supplies.models.reference.ItemTypeRef;
import com.sentinel.smarter.modules.supplies.models.reference.ItemUomRef;
import com.sentinel.smarter.modules.supplies.models.view.ItemItemTypeView;
import com.sentinel.smarter.modules.supplies.models.view.ItemView;
import com.sentinel.smarter.modules.supplies.payloads.request.ItemRequest;
import com.sentinel.smarter.modules.supplies.repositories.ItemRepo;
import com.sentinel.smarter.modules.supplies.repositories.reference.ItemTypeRefRepo;
import com.sentinel.smarter.modules.supplies.repositories.reference.ItemUomRefRepo;
import com.sentinel.smarter.modules.supplies.repositories.view.ItemItemTypeViewRepo;
import com.sentinel.smarter.modules.supplies.repositories.view.ItemViewRepo;
import com.sentinel.smarter.modules.supplies.services.ItemService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class ItemImpl implements ItemService {
     private ModelMap modelMap = new ModelMap();

     @Autowired
     private ItemViewRepo itemViewRepo;
     @Autowired
     private ItemItemTypeViewRepo itemItemTypeViewRepo;
     @Autowired
     private ItemTypeRefRepo itemTypeRefRepo;
     @Autowired
     private ItemUomRefRepo itemUomRefRepo;
     @Autowired
     private ItemRepo itemRepo;

    //view

    public Response findItemViewByIDCompany(String id_perusahaan){
        List<ItemView> itemViews = itemViewRepo.findItemViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data barang ditemukan", itemViews);
        return response;
    }

    public Response findItemItemTypeViewByIDCompany(String id_perusahaan){
        List<ItemItemTypeView> itemItemTypeViews = itemItemTypeViewRepo.findItemItemTypeViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data barang ditemukan", itemItemTypeViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<ItemTypeRef> itemTypeRefs = itemTypeRefRepo.findItemTypeByIDCompany(id_perusahaan);
        modelMap.put("itemtype", itemTypeRefs);
        List<ItemUomRef> itemUomRefs = itemUomRefRepo.findUomByIDCompany(id_perusahaan);
        modelMap.put("uom", itemUomRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getItemByID(String id){
        Item item = itemRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data barang tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data barang ditemukan", item);
    }

    @Override
    public Response addItem(ItemRequest request){
        Item item = new Item();
        item.setID_perusahaan(request.getID_perusahaan());
        item.setKode(request.getKode());
        item.setID_jenis_barang(request.getID_jenis_barang());
        item.setNama(request.getNama());
        item.setID_satuan(request.getID_satuan());
        item.setHarga(request.getHarga());
        item.setGambar(request.getGambar());
        item.setKeterangan(request.getKeterangan());
        item.setID_pengguna(request.getID_pengguna());

        itemRepo.save(item);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data barang berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateItemByID(String id, ItemRequest request){
        Item item = itemRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data barang tidak ditemukan");
        });

        item.setID_perusahaan(request.getID_perusahaan());
        item.setKode(request.getKode());
        item.setID_jenis_barang(request.getID_jenis_barang());
        item.setNama(request.getNama());
        item.setID_satuan(request.getID_satuan());
        item.setHarga(request.getHarga());
        item.setGambar(request.getGambar());
        item.setKeterangan(request.getKeterangan());
        item.setID_pengguna(request.getID_pengguna());

        itemRepo.save(item);

        return new Response(HttpStatus.OK.value(), "data barang berhasil disimpan", null);
    }
}
