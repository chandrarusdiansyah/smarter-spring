package com.sentinel.smarter.implamentations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.models.Application;
import com.sentinel.smarter.payloads.request.ApplicationRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.ApplicationRepo;
import com.sentinel.smarter.services.ApplicationService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ApplicationImpl implements ApplicationService{
    @Autowired
    private ApplicationRepo applicationRepo;

    //list
    
    @Override
    public Response findApplicationByIDCompany(String id_perusahaan){
        List<Application> application = applicationRepo.findApplicationByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data aplikasi ditemukan", application);
        return response;
    }

    //control

    @Override
    public Response getApplicationByID(String id){
        Application application = applicationRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data aplikasi tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data aplikasi ditemukan", application);
    }

    @Override
    public Response addApplication(ApplicationRequest request){
        Application application = new Application();

        application.setID_perusahaan(request.getID_perusahaan());
        application.setKode(request.getKode());
        application.setNama(request.getNama());
        application.setKeterangan(request.getKeterangan());
        application.setLogo(request.getLogo());
        application.setTautan(request.getTautan());
        application.setID_pengguna(request.getID_pengguna());

        applicationRepo.save(application);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data aplikasi berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateApplicationByID(String id, ApplicationRequest request){
        Application application = applicationRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data aplikasi tidak ditemukan");
        });

        application.setID_perusahaan(request.getID_perusahaan());
        application.setKode(request.getKode());
        application.setNama(request.getNama());
        application.setKeterangan(request.getKeterangan());
        application.setLogo(request.getLogo());
        application.setTautan(request.getTautan());
        application.setID_pengguna(request.getID_pengguna());

        applicationRepo.save(application);

        return new Response(HttpStatus.OK.value(), "data tamu berhasil disimpan", null);
    }
}
