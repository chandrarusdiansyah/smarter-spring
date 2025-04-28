package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.pelita.models.Infrastructure;
import com.sentinel.smarter.modules.pelita.models.reference.ConditionRef;
import com.sentinel.smarter.modules.pelita.models.reference.FloorRef;
import com.sentinel.smarter.modules.pelita.models.reference.InfrastructureTypeRef;
import com.sentinel.smarter.modules.pelita.models.view.InfrastructureConditionView;
import com.sentinel.smarter.modules.pelita.models.view.InfrastructureView;
import com.sentinel.smarter.modules.pelita.payloads.request.InfrastructureRequest;
import com.sentinel.smarter.modules.pelita.repositories.InfrastructureRepo;
import com.sentinel.smarter.modules.pelita.repositories.reference.ConditionRefRepo;
import com.sentinel.smarter.modules.pelita.repositories.reference.FloorRefRepo;
import com.sentinel.smarter.modules.pelita.repositories.reference.InfrastructureTypeRefRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.InfastructureConditionViewRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.InfrastructureViewRepo;
import com.sentinel.smarter.modules.pelita.services.InfrastructureService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class InfrastructureImpl implements InfrastructureService {
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private InfrastructureViewRepo infrastructureViewRepo;
    @Autowired
    private InfastructureConditionViewRepo infastructureConditionViewRepo;
    @Autowired
    private InfrastructureTypeRefRepo infrastructureTypeRefRepo;
    @Autowired
    private FloorRefRepo floorRefRepo;
    @Autowired
    private ConditionRefRepo conditionRefRepo;
    @Autowired
    private InfrastructureRepo infrastructureRepo;

    //view

    @Override
    public Response findInfrastructureViewByIDCompany(String id_perusahaan){
        List<InfrastructureView> infrastructureViews = infrastructureViewRepo.findInfrastructureViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data prasarana ditemukan", infrastructureViews);
        return response;
    }

    @Override
    public Response findInfrastructureViewAvailable(String id_perusahaan){
        List<InfrastructureView> infrastructureViews = infrastructureViewRepo.findInfrastructureViewAvailable(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data prasarana ditemukan", infrastructureViews);
        return response;
    }

    @Override
    public Response findInfrastructureConditionViewByIDCompany(String id_perusahaan){
        List<InfrastructureConditionView> infrastructureConditionViews = infastructureConditionViewRepo.findInfrastructureConditionViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data prasarana ditemukan", infrastructureConditionViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<InfrastructureTypeRef> infrastructureTypeRefs = infrastructureTypeRefRepo.findInfrastructureTypeByIDCompany(id_perusahaan);
        modelMap.put("infrastructuretype", infrastructureTypeRefs);
        List<FloorRef> floorRefs = floorRefRepo.findFloorByIDCompany(id_perusahaan);
        modelMap.put("floor", floorRefs);
        List<ConditionRef> conditionRefs = conditionRefRepo.findConditionByIDCompany(id_perusahaan);
        modelMap.put("condition", conditionRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getInfrastructureByID(String id){
        Infrastructure infrastructure = infrastructureRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data prasarana tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data prasarana ditemukan", infrastructure);
    }

    @Override
    public Response addInfrastructure(InfrastructureRequest request){
        Infrastructure infrastructure = new Infrastructure();

        infrastructure.setID_perusahaan(request.getID_perusahaan());
        infrastructure.setID_satuan_kerja(request.getID_satuan_kerja());
        infrastructure.setID_jenis_barang(request.getID_jenis_barang());
        infrastructure.setID_alokasi(request.getID_alokasi());
        infrastructure.setID_jenis_prasarana(request.getID_jenis_prasarana());
        infrastructure.setID_lantai(request.getID_lantai());
        infrastructure.setKode(request.getKode());
        infrastructure.setNama(request.getNama());
        infrastructure.seKeterangan(request.getKeterangan());
        infrastructure.setKapasitas(request.getKapasitas());
        infrastructure.setID_kondisi(request.getID_kondisi());
        infrastructure.setInternal(request.getInternal());
        infrastructure.setSewa(request.getSewa());
        infrastructure.setRawat(request.getRawat());
        infrastructure.setFoto(request.getFoto());
        infrastructure.setID_pengguna(request.getID_pengguna());

        infrastructureRepo.save(infrastructure);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data prasarana berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateInfrastructureByID(String id, InfrastructureRequest request){
        Infrastructure infrastructure = infrastructureRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data prasarana tidak ditemukan");
        });

        infrastructure.setID_perusahaan(request.getID_perusahaan());
        infrastructure.setID_satuan_kerja(request.getID_satuan_kerja());
        infrastructure.setID_jenis_barang(request.getID_jenis_barang());
        infrastructure.setID_alokasi(request.getID_alokasi());
        infrastructure.setID_jenis_prasarana(request.getID_jenis_prasarana());
        infrastructure.setID_lantai(request.getID_lantai());
        infrastructure.setKode(request.getKode());
        infrastructure.setNama(request.getNama());
        infrastructure.seKeterangan(request.getKeterangan());
        infrastructure.setKapasitas(request.getKapasitas());
        infrastructure.setID_kondisi(request.getID_kondisi());
        infrastructure.setInternal(request.getInternal());
        infrastructure.setSewa(request.getSewa());
        infrastructure.setRawat(request.getRawat());
        infrastructure.setFoto(request.getFoto());
        infrastructure.setID_pengguna(request.getID_pengguna());

        infrastructureRepo.save(infrastructure);

        return new Response(HttpStatus.OK.value(), "data prasarana berhasil disimpan", null);
    }

}
