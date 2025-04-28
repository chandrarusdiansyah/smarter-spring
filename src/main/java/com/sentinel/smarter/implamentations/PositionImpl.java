package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.Position;
import com.sentinel.smarter.payloads.request.PositionRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.PositionRepo;
import com.sentinel.smarter.services.PositionService;

@Service
public class PositionImpl implements PositionService {
    
    @Autowired
    private PositionRepo positionRepo;

    //list
    
    @Override
    public Response findPositionByIDCompany(String id_perusahaan){
        List<Position> positions = positionRepo.findPositionByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data jabatan ditemukan", positions);
        return response;
    }

    //control

    @Override
    public Response getPositionByID(String id){
        Position position = positionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data jabatan tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data jabatan ditemukan", position);
    }

    @Override
    public Response addPosition(PositionRequest request){
        Position position = new Position();

        position.setID_perusahaan(request.getID_perusahaan());
        position.setKode(request.getKode());
        position.setNama(request.getNama());
        position.seKeterangan(request.getKeterangan());
        position.setID_pengguna(request.getID_pengguna());

        positionRepo.save(position);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data jabatan berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updatePositionByID(String id, PositionRequest request){
        Position position = positionRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data jabatan tidak ditemukan");
        });
        
        position.setID_perusahaan(request.getID_perusahaan());
        position.setKode(request.getKode());
        position.setNama(request.getNama());
        position.seKeterangan(request.getKeterangan());
        position.setID_pengguna(request.getID_pengguna());

        positionRepo.save(position);

        return new Response(HttpStatus.OK.value(), "data jabatan berhasil disimpan", null);
    }
}
