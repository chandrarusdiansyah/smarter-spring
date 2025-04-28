package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.Division;
import com.sentinel.smarter.payloads.request.DivisionRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.DivisionRepo;
import com.sentinel.smarter.services.DivisionService;

@Service
public class DivisionImpl implements DivisionService{
     @Autowired
    private DivisionRepo divisionRepo;

    //list

    @Override
    public Response findDivisionByIDCompany(String id_perusahaan){
        List<Division> divisions = divisionRepo.findDivisionByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data divisi ditemukan", divisions);
        return response;
    }

    //control

    @Override
    public Response getDivisionByID(String id){
        Division division = divisionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data divisi tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data tamu ditemukan", division);
    }

    @Override
    public Response addDivision(DivisionRequest request){
        Division division = new Division();

        division.setID_perusahaan(request.getID_perusahaan());
        division.setKode(request.getKode());
        division.setNama(request.getNama());
        division.seKeterangan(request.getKeterangan());
        division.setID_pengguna(request.getID_pengguna());

        divisionRepo.save(division);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data divisi berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateDivisionByID(String id, DivisionRequest request){
        Division division = divisionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data divisi tidak ditemukan");
        });
        
        division.setID_perusahaan(request.getID_perusahaan());
        division.setKode(request.getKode());
        division.setNama(request.getNama());
        division.seKeterangan(request.getKeterangan());
        division.setID_pengguna(request.getID_pengguna());

        divisionRepo.save(division);

        return new Response(HttpStatus.OK.value(), "data divisi berhasil disimpan", null);
    }
}
