package com.sentinel.smarter.modules.pelita.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.pelita.models.Guest;
import com.sentinel.smarter.modules.pelita.models.reference.GuestTypeRef;
import com.sentinel.smarter.modules.pelita.models.view.GuestView;
import com.sentinel.smarter.modules.pelita.payloads.request.GuestRequest;
import com.sentinel.smarter.modules.pelita.repositories.GuestRepo;
import com.sentinel.smarter.modules.pelita.repositories.reference.GuestTypeRefRepo;
import com.sentinel.smarter.modules.pelita.repositories.view.GuestViewRepo;
import com.sentinel.smarter.modules.pelita.services.GuestService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class GuestImpl implements GuestService {
    private ModelMap modelMap = new ModelMap();

    @Autowired
    private GuestViewRepo guestViewRepo;
    @Autowired
    private GuestTypeRefRepo guestTypeRefRepo;
    @Autowired
    private GuestRepo guestRepo;

    //view

    @Override
    public Response findGuestViewByIDCompany(String id_perusahaan){
        List<GuestView> guestViews = guestViewRepo.findGuestViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data tamu ditemukan", guestViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<GuestTypeRef> guestTypeRefs = guestTypeRefRepo.findGuestTypeByIDCompany(id_perusahaan);
        modelMap.put("guesttype", guestTypeRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getGuestByID(String id){
        Guest guest = guestRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data tamu tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data tamu ditemukan", guest);
    }

    @Override
    public Response addGuest(GuestRequest request){
        Guest guest = new Guest();

        guest.setID_perusahaan(request.getID_perusahaan());
        guest.setID_jenis_tamu(request.getID_jenis_tamu());
        guest.setNama(request.getNama());
        guest.setInstansi(request.getInstansi());
        guest.setAlamat(request.getAlamat());
        guest.setTelepon(request.getTelepon());
        guest.setEmail(request.getEmail());
        guest.setKeterangan(request.getKeterangan());
        guest.setID_pengguna(request.getID_pengguna());

        guestRepo.save(guest);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data tamu berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateGuestByID(String id, GuestRequest request){
        Guest guest = guestRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data tamu tidak ditemukan");
        });

        guest.setID_perusahaan(request.getID_perusahaan());
        guest.setID_jenis_tamu(request.getID_jenis_tamu());
        guest.setNama(request.getNama());
        guest.setInstansi(request.getInstansi());
        guest.setAlamat(request.getAlamat());
        guest.setTelepon(request.getTelepon());
        guest.setEmail(request.getEmail());
        guest.setKeterangan(request.getKeterangan());
        guest.setID_pengguna(request.getID_pengguna());

        guestRepo.save(guest);

        return new Response(HttpStatus.OK.value(), "data tamu berhasil disimpan", null);
    }

}
