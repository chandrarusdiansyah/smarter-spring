package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.WorkUnit;
import com.sentinel.smarter.payloads.request.WorkUnitRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.WorkUnitRepo;
import com.sentinel.smarter.services.WorkUnitService;

@Service
public class WorkUnitImpl implements WorkUnitService{
    @Autowired
    private WorkUnitRepo workUnitRepo;

    //list

    @Override
    public Response findWorkUnitByIDCompany(String id_perusahaan){
        List<WorkUnit> workUnits = workUnitRepo.findWorkUnitByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data unit kerja ditemukan", workUnits);
        return response;
    }

    //control

    @Override
    public Response getWorkUnitByID(String id){
        WorkUnit workUnit = workUnitRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data unit kerja tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data unit kerja ditemukan", workUnit);
    }

    @Override
    public Response addWorkUnit(WorkUnitRequest request){
        WorkUnit workUnit = new WorkUnit();

        workUnit.setID_perusahaan(request.getID_perusahaan());
        workUnit.setKode(request.getKode());
        workUnit.setNama(request.getNama());
        workUnit.seKeterangan(request.getKeterangan());
        workUnit.setID_pengguna(request.getID_pengguna());

        workUnitRepo.save(workUnit);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data unit kerja berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateWorkUnitByID(String id, WorkUnitRequest request){
        WorkUnit workUnit = workUnitRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data unit kerja tidak ditemukan");
        });
        
        workUnit.setID_perusahaan(request.getID_perusahaan());
        workUnit.setKode(request.getKode());
        workUnit.setNama(request.getNama());
        workUnit.seKeterangan(request.getKeterangan());
        workUnit.setID_pengguna(request.getID_pengguna());

        workUnitRepo.save(workUnit);

        return new Response(HttpStatus.OK.value(), "data unit kerja berhasil disimpan", null);
    }
}
