package com.sentinel.smarter.modules.smartproc.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.smartproc.models.Partner;
import com.sentinel.smarter.modules.smartproc.payloads.request.PartnerRequest;
import com.sentinel.smarter.modules.smartproc.repositories.PartnerRepo;
import com.sentinel.smarter.modules.smartproc.services.PartnerService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class PartnerImpl implements PartnerService {
    @Autowired
    private PartnerRepo partnerRepo;

    // List

    @Override
    public Response findPartnerByIDCompany(String id_perusahaan){
        List<Partner> partners = partnerRepo.findPartnerByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data penyedia barang/jasa ditemukan", partners);
        return response;
    }   

    //control

    @Override
    public Response getPartnerByID(String id){
        Partner partner = partnerRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data penyedia barang/jasa tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data penyedia barang/jasa ditemukan", partner);
    }

    @Override
    public Response addPartner(PartnerRequest request){
        Partner partner = new Partner();

        partner.setID_perusahaan(request.getID_perusahaan());
        partner.setNama(request.getNama());
        partner.setAlamat(request.getAlamat());
        partner.setKontak(request.getKontak());
        partner.setTelepon(request.getTelepon());
        partner.setSeluler(request.getSeluler());
        partner.setKeterangan(request.getKeterangan());
        partner.setID_pengguna(request.getID_pengguna());

        partnerRepo.save(partner);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data penyedia barang/jasa berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updatePartnerByID(String id, PartnerRequest request){
        Partner partner = partnerRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data penyedia barang/jasa tidak ditemukan");
        });
        
        partner.setID_perusahaan(request.getID_perusahaan());
        partner.setNama(request.getNama());
        partner.setAlamat(request.getAlamat());
        partner.setKontak(request.getKontak());
        partner.setTelepon(request.getTelepon());
        partner.setSeluler(request.getSeluler());
        partner.setKeterangan(request.getKeterangan());
        partner.setID_pengguna(request.getID_pengguna());

        partnerRepo.save(partner);

        return new Response(HttpStatus.OK.value(), "data penyedia barang/jasa berhasil disimpan", null);
    }

}
