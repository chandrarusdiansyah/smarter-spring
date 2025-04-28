package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.WorkPlace;
import com.sentinel.smarter.payloads.request.WorkPlaceRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.WorkPlaceRepo;
import com.sentinel.smarter.services.WorkPlaceService;

@Service
public class WorkPlaceImpl implements WorkPlaceService {
    @Autowired
    private WorkPlaceRepo workPlaceRepo;

    //list

    @Override
    public Response findWorkPlaceByIDCompany(String id_perusahaan){
        List<WorkPlace> workPlaces = workPlaceRepo.findWorkPlaceByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data satuan kerja ditemukan", workPlaces);
        return response;
    }

    //control

    @Override
    public Response getWorkPlaceByID(String id){
        WorkPlace workPlace = workPlaceRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data Place kerja tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data satuan kerja ditemukan", workPlace);
    }

    @Override
    public Response addWorkPlace(WorkPlaceRequest request){
        WorkPlace workPlace = new WorkPlace();

        workPlace.setID_perusahaan(request.getID_perusahaan());
        workPlace.setKode(request.getKode());
        workPlace.setNama(request.getNama());
        workPlace.setLokasi(request.getLokasi());
        workPlace.seKeterangan(request.getKeterangan());
        workPlace.setLatitude(request.getLatitude());
        workPlace.setLongitude(request.getLongitude());
        workPlace.setID_pengguna(request.getID_pengguna());

        workPlaceRepo.save(workPlace);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data satuan kerja berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateWorkPlaceByID(String id, WorkPlaceRequest request){
        WorkPlace workPlace = workPlaceRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data satuan kerja tidak ditemukan");
        });
        
        workPlace.setID_perusahaan(request.getID_perusahaan());
        workPlace.setKode(request.getKode());
        workPlace.setNama(request.getNama());
        workPlace.setLokasi(request.getLokasi());
        workPlace.seKeterangan(request.getKeterangan());
        workPlace.setLatitude(request.getLatitude());
        workPlace.setLongitude(request.getLongitude());
        workPlace.setID_pengguna(request.getID_pengguna());

        workPlaceRepo.save(workPlace);

        return new Response(HttpStatus.OK.value(), "data satuan kerja berhasil disimpan", null);
    }
}
