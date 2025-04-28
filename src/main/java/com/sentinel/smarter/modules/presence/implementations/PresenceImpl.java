package com.sentinel.smarter.modules.presence.implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.WorkPlace;
import com.sentinel.smarter.modules.presence.models.Presence;
import com.sentinel.smarter.modules.presence.models.reference.PresenceStatusRef;
import com.sentinel.smarter.modules.presence.models.reference.WorkTypeRef;
import com.sentinel.smarter.modules.presence.models.view.EmployeeContractView;
import com.sentinel.smarter.modules.presence.models.view.PresenceView;
import com.sentinel.smarter.modules.presence.payloads.request.PresenceRequest;
import com.sentinel.smarter.modules.presence.repositories.PresenceRepo;
import com.sentinel.smarter.modules.presence.repositories.reference.PresenceStatusRefRepo;
import com.sentinel.smarter.modules.presence.repositories.reference.WorkTypeRefRepo;
import com.sentinel.smarter.modules.presence.repositories.view.EmployeeContractViewRepo;
import com.sentinel.smarter.modules.presence.repositories.view.PresenceViewRepo;
import com.sentinel.smarter.modules.presence.services.PresenceService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.WorkPlaceRepo;

@Service
public class PresenceImpl implements PresenceService {
    private ModelMap modelMap = new ModelMap();
    @Autowired
    private PresenceViewRepo presenceViewRepo;
    @Autowired
    private WorkPlaceRepo workPlaceRepo;
    @Autowired
    private PresenceStatusRefRepo presenceStatusRefRepo;
    @Autowired
    private WorkTypeRefRepo workTypeRefRepo;
    @Autowired
    private PresenceRepo presenceRepo;
    @Autowired
    private EmployeeContractViewRepo employeeContractViewRepo;

    //view

    @Override
    public Response findPresenceByQuery(String sql) {
        List<PresenceView> presenceViews = presenceViewRepo.findPresenceByQuery(sql);
        Response response = new Response(HttpStatus.OK.value(),"data presensi ditemukan", presenceViews);
        return response;
    }

    @Override
    public Response findPresenceByIDCompany(String id_perusahaan) {
        List<PresenceView> presenceViews = presenceViewRepo.findPresenceByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data presensi ditemukan", presenceViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan) {
        modelMap.clear();
        List<WorkPlace> workPlaces = workPlaceRepo.findWorkPlaceByIDCompany(id_perusahaan);
        modelMap.put("workplace", workPlaces);
        List<Map<String,?>> mapWorkPlaces = new ArrayList<Map<String, ?>> (); 
        for (int i = 0; i < workPlaces.size(); i++) {
            Map<String,Object> map = new HashMap<String, Object>();
                map.put("value", workPlaces.get(i).getID());
                map.put("text", workPlaces.get(i).getKode() + " - " + workPlaces.get(i).getNama() + " - " + workPlaces.get(i).getLokasi());
                mapWorkPlaces.add(map);
        }
        modelMap.put("multiworkplace", mapWorkPlaces);
        List<WorkTypeRef> workTypeRefs = workTypeRefRepo.findWorkTypeByIDCompany(id_perusahaan);
        modelMap.put("worktype", workTypeRefs);
        List<Map<String,?>> mapWorkTypeRefs = new ArrayList<Map<String, ?>> (); 
        for (int i = 0; i < workTypeRefs.size(); i++) {
            Map<String,Object> map = new HashMap<String, Object>();
                map.put("value", workTypeRefs.get(i).getID());
                map.put("text", workTypeRefs.get(i).getNama());
                mapWorkTypeRefs.add(map);
        }
        modelMap.put("multiworktype", mapWorkTypeRefs);
        List<PresenceStatusRef> presenceStatusRefs = presenceStatusRefRepo.findPresenceStatusByIDCompany(id_perusahaan);
        modelMap.put("presencestatus", presenceStatusRefs);
        List<Map<String,?>> mapPresenceStatusRefs = new ArrayList<Map<String, ?>> (); 
        for (int i = 0; i < presenceStatusRefs.size(); i++) {
            Map<String,Object> map = new HashMap<String, Object>();
                map.put("value", presenceStatusRefs.get(i).getID());
                map.put("text", presenceStatusRefs.get(i).getNama());
                mapPresenceStatusRefs.add(map);
        }
        modelMap.put("multipresencestatus", mapPresenceStatusRefs);
        List<EmployeeContractView> employeeContractViews = employeeContractViewRepo.findEmployeeContractViewByIDCompany(id_perusahaan);
        List<Map<String,?>> mapEmployeeContractViews = new ArrayList<Map<String, ?>> (); 
        for (int i = 0; i < employeeContractViews.size(); i++) {
            Map<String,Object> map = new HashMap<String, Object>();
                map.put("value", employeeContractViews.get(i).getID());
                map.put("text", employeeContractViews.get(i).getNik() + " - " + employeeContractViews.get(i).getNama() + " || SATKER: " + employeeContractViews.get(i).getKode_satuan_kerja() + " - "  + employeeContractViews.get(i).getNama_satuan_kerja() + " - "  + employeeContractViews.get(i).getLokasi_satuan_kerja());
                mapEmployeeContractViews.add(map);
        }
        modelMap.put("multiemployeecontract", mapEmployeeContractViews);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getPresencetByID(String id) {
        Presence presence = presenceRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data presensi tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data presensi ditemukan", presence);
    }

    @Override
    public Response addPresence(PresenceRequest request) {
        Presence presence = new Presence();

        presence.setID_perusahaan(request.getID_perusahaan());
        presence.setID_pegawai(request.getID_pegawai());
        presence.setTanggal(request.getTanggal());
        presence.setID_jenis_presensi(request.getID_jenis_presensi());
        presence.setID_status_presensi(request.getID_status_presensi());
        presence.setJam_masuk(request.getJam_masuk());
        presence.setMasuk_latitude(request.getMasuk_latitude());
        presence.setMasuk_longitude(request.getMasuk_longitude());
        presence.setMasuk_foto(request.getMasuk_foto());
        presence.setJam_keluar(request.getJam_keluar());
        presence.setKeluar_latitude(request.getKeluar_latitude());
        presence.setKeluar_longitude(request.getKeluar_longitude());
        presence.setKeluar_foto(request.getKeluar_foto());
        presence.setID_pengguna(request.getID_pengguna());

        presenceRepo.save(presence);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data presensi berhasil disimpan");
        response.setData(null);
        return response;
    }

    @Override
    public Response updatePresenceByID(String id, PresenceRequest request) {
        Presence presence = presenceRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data presensi tidak ditemukan");
        });

        presence.setID_perusahaan(request.getID_perusahaan());
        presence.setID_pegawai(request.getID_pegawai());
        presence.setTanggal(request.getTanggal());
        presence.setID_jenis_presensi(request.getID_jenis_presensi());
        presence.setID_status_presensi(request.getID_status_presensi());
        presence.setJam_masuk(request.getJam_masuk());
        presence.setMasuk_latitude(request.getMasuk_latitude());
        presence.setMasuk_longitude(request.getMasuk_longitude());
        presence.setMasuk_foto(request.getMasuk_foto());
        presence.setJam_keluar(request.getJam_keluar());
        presence.setKeluar_latitude(request.getKeluar_latitude());
        presence.setKeluar_longitude(request.getKeluar_longitude());
        presence.setKeluar_foto(request.getKeluar_foto());
        presence.setID_pengguna(request.getID_pengguna());

        presenceRepo.save(presence);

        return new Response(HttpStatus.OK.value(), "data presensi berhasil disimpan", null);
    }

    @Override
    public Response deletePresenceByID(String id){
        presenceRepo.deleteById(id);
        return new Response(HttpStatus.OK.value(), "data presensi berhasil dihapus", null);
    }

    //android

    @Override
    public Response findPresenceByIDEmployeeContract(String id) {
        List<PresenceView> presenceViews = presenceViewRepo.findPresenceByIDEmployeeContract(id);
        Response response = new Response(HttpStatus.OK.value(),"data presensi ditemukan", presenceViews);
        return response;
    }

    @Override
    public Response findPresenceTodayByIDEmployeeContract(String id) {
        List<PresenceView> presenceViews = presenceViewRepo.findPresenceTodayByIDEmployeeContract(id);
        Response response = new Response(HttpStatus.OK.value(),"data presensi ditemukan", presenceViews);
        return response;
    }

    @Override
    public Response addPresenceIn(PresenceRequest request) {
        Presence presence = new Presence();

        presence.setID_perusahaan(request.getID_perusahaan());
        presence.setID_pegawai(request.getID_pegawai());
        presence.setTanggal(request.getTanggal());
        presence.setID_jenis_presensi(request.getID_jenis_presensi());
        presence.setID_status_presensi(request.getID_status_presensi());
        presence.setJam_masuk(request.getJam_masuk());
        presence.setMasuk_latitude(request.getMasuk_latitude());
        presence.setMasuk_longitude(request.getMasuk_longitude());
        presence.setMasuk_foto(request.getMasuk_foto());
        presence.setID_pengguna(request.getID_pengguna());

        presenceRepo.save(presence);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data presensi berhasil disimpan");
        response.setData(null);
        return response;
    }

    @Override
    public Response addPresenceOut(String id, PresenceRequest request) {
        Presence presence = presenceRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data presensi tidak ditemukan");
        });
        presence.setJam_keluar(request.getJam_keluar());
        presence.setKeluar_latitude(request.getKeluar_latitude());
        presence.setKeluar_longitude(request.getKeluar_longitude());
        presence.setKeluar_foto(request.getKeluar_foto());
        presenceRepo.save(presence);
        return new Response(HttpStatus.OK.value(), "data presensi berhasil disimpan", null);
    }
    
}
