package com.sentinel.smarter.modules.simpatik.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.simpatik.models.Asset;
import com.sentinel.smarter.modules.simpatik.models.reference.AssetTypeRef;
import com.sentinel.smarter.modules.simpatik.models.view.AssetView;
import com.sentinel.smarter.modules.simpatik.payloads.request.AssetRequest;
import com.sentinel.smarter.modules.simpatik.repositories.AssetRepo;
import com.sentinel.smarter.modules.simpatik.repositories.reference.AssetTypeRefRepo;
import com.sentinel.smarter.modules.simpatik.repositories.view.AssetViewRepo;
import com.sentinel.smarter.modules.simpatik.services.AssetService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class AssetImpl implements AssetService{
    
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private AssetRepo assetRepo;
    @Autowired
    private AssetViewRepo assetViewRepo;
    @Autowired
    private AssetTypeRefRepo assetTypeRefRepo;

    //view

    @Override
    public Response findAssetByIDCompany(String id_perusahaan){
        List<Asset> item = assetRepo.findAssetByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data aset ditemukan", item);
        return response;
    }

    @Override
    public Response findAssetViewByIDCompany(String id_perusahaan){
        List<AssetView> assetViews = assetViewRepo.findAssetViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data aset ditemukan", assetViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<AssetTypeRef> assetTypeRefs = assetTypeRefRepo.findAssetTypeByIDCompany(id_perusahaan);
        modelMap.put("itemtype", assetTypeRefs);
        Response response = new Response(HttpStatus.OK.value(),"data aset ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response addAsset(AssetRequest request){
        Asset asset = new Asset();
        asset.setID_perusahaan(request.getID_perusahaan());
        asset.setID_jenis_barang(request.getID_jenis_barang());
        asset.setKode(request.getKode());
        asset.setNama(request.getNama());
        asset.setKeterangan(request.getKeterangan());
        asset.setID_pengguna(request.getID_pengguna());

        assetRepo.save(asset);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data aset berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response getAssetByID(String id){
        Asset asset = assetRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data aset tidak ditemukan");
        });

        return new Response(HttpStatus.OK.value(), "data aset ditemukan", asset);
    }

    @Override
    public Response updateAssetByID(String id, AssetRequest request){
        Asset asset = assetRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data aset tidak ditemukan");
        });

        asset.setID_perusahaan(request.getID_perusahaan());
        asset.setID_jenis_barang(request.getID_jenis_barang());
        asset.setKode(request.getKode());
        asset.setNama(request.getNama());
        asset.setKeterangan(request.getKeterangan());
        asset.setID_pengguna(request.getID_pengguna());

        assetRepo.save(asset);

        return new Response(HttpStatus.OK.value(), "data aset berhasil disimpan", null);
    }

    @Override
    public Response deleteAssetByID(String id){
        assetRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data aset berhasil dihapus", null);
    }
    
}
