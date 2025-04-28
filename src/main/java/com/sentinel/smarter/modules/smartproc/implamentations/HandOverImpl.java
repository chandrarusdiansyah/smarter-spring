package com.sentinel.smarter.modules.smartproc.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.smartproc.models.HandOver;
import com.sentinel.smarter.modules.smartproc.payloads.request.HandOverRequest;
import com.sentinel.smarter.modules.smartproc.repositories.HandOverRepo;
import com.sentinel.smarter.modules.smartproc.services.HandOverService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class HandOverImpl implements HandOverService {
    @Autowired
    private HandOverRepo handOverRepo;

    // view

    @Override
    public Response findHandOverByIDCompany(String id_perusahaan){
        List<HandOver> handOvers = handOverRepo.findHandOverByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data berita acara ditemukan", handOvers);
        return response;
    }   

    @Override
    public Response findHandOverByIDContract(String id_perusahaan, String id_kontrak){
        List<HandOver> handOvers = handOverRepo.findHandOverByIDContract(id_perusahaan, id_kontrak);
        Response response = new Response(HttpStatus.OK.value(),"data berita acara ditemukan", handOvers);
        return response;
    }   


    //control

    @Override
    public Response getHandOverByID(String id){
        HandOver handOver = handOverRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data berita acara tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data berita acara ditemukan", handOver);
    }

    @Override
    public Response addHandOver(HandOverRequest request){
        HandOver handOver = new HandOver();

        handOver.setID_perusahaan(request.getID_perusahaan());
        handOver.setID_kontrak(request.getID_kontrak());
        handOver.setNomor(request.getNomor());
        handOver.setTanggal(request.getTanggal());
        handOver.setDeskripsi(request.getDeskripsi());
        handOver.setID_pengguna(request.getID_pengguna());

        handOverRepo.save(handOver);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data berita acara berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateHandOverByID(String id, HandOverRequest request){
        HandOver handOver = handOverRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data berita acara tidak ditemukan");
        });
        
        handOver.setID_perusahaan(request.getID_perusahaan());
        handOver.setID_kontrak(request.getID_kontrak());
        handOver.setNomor(request.getNomor());
        handOver.setTanggal(request.getTanggal());
        handOver.setDeskripsi(request.getDeskripsi());
        handOver.setID_pengguna(request.getID_pengguna());

        handOverRepo.save(handOver);

        return new Response(HttpStatus.OK.value(), "data berita acara berhasil disimpan", null);
    }

    @Override
    public Response deleteHandOverByID(String id){
        handOverRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data berita acara berhasil dihapus", null);
    }

}
