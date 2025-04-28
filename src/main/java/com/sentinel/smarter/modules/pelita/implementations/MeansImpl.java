package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.pelita.models.Means;
import com.sentinel.smarter.modules.pelita.models.reference.ConditionRef;
import com.sentinel.smarter.modules.pelita.models.view.MeansView;
import com.sentinel.smarter.modules.pelita.payloads.request.MeansRequest;
import com.sentinel.smarter.modules.pelita.repositories.MeansRepo;
import com.sentinel.smarter.modules.pelita.repositories.reference.ConditionRefRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.MeansViewRepo;
import com.sentinel.smarter.modules.pelita.services.MeansService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class MeansImpl implements MeansService {
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private MeansViewRepo meansViewRepo;
    @Autowired
    private ConditionRefRepo conditionRefRepo;
    @Autowired
    private MeansRepo meansRepo;

    //view

    @Override
    public Response findMeansViewByIDCompany(String id_perusahaan){
        List<MeansView> meansViews = meansViewRepo.findMeansViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data sarana ditemukan", meansViews);
        return response;
    }

    @Override
    public Response findMeansViewAvailable(String id_perusahaan){
        List<MeansView> MeansViews = meansViewRepo.findMeansViewAvailable(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data sarana ditemukan", MeansViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
      List<ConditionRef> conditionRefs = conditionRefRepo.findConditionByIDCompany(id_perusahaan);
        modelMap.put("condition", conditionRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getMeansByID(String id){
        Means means = meansRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data sarana tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data sarana ditemukan", means);
    }

    @Override
    public Response addMeans(MeansRequest request){
        Means means = new Means();

        means.setID_perusahaan(request.getID_perusahaan());
        means.setID_satuan_kerja(request.getID_satuan_kerja());
        means.setID_jenis_barang(request.getID_jenis_barang());
        means.setID_alokasi(request.getID_alokasi());
        means.setKode(request.getKode());
        means.setNama(request.getNama());
        means.seKeterangan(request.getKeterangan());
        means.setID_kondisi(request.getID_kondisi());
        means.setInternal(request.getInternal());
        means.setSewa(request.getSewa());
        means.setRawat(request.getRawat());
        means.setFoto(request.getFoto());
        means.setID_pengguna(request.getID_pengguna());

        meansRepo.save(means);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data sarana berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateMeansByID(String id, MeansRequest request){
        Means means = meansRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data sarana tidak ditemukan");
        });

        means.setID_perusahaan(request.getID_perusahaan());
        means.setID_satuan_kerja(request.getID_satuan_kerja());
        means.setID_jenis_barang(request.getID_jenis_barang());
        means.setID_alokasi(request.getID_alokasi());
        means.setKode(request.getKode());
        means.setNama(request.getNama());
        means.seKeterangan(request.getKeterangan());
        means.setID_kondisi(request.getID_kondisi());
        means.setInternal(request.getInternal());
        means.setSewa(request.getSewa());
        means.setRawat(request.getRawat());
        means.setFoto(request.getFoto());
        means.setID_pengguna(request.getID_pengguna());

        meansRepo.save(means);

        return new Response(HttpStatus.OK.value(), "data sarana berhasil disimpan", null);
    }
}
