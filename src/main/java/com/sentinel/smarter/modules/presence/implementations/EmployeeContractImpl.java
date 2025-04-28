package com.sentinel.smarter.modules.presence.implementations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.modules.presence.models.EmployeeContract;
import com.sentinel.smarter.modules.presence.models.graphic.EmployeeContractGenderGraph;
import com.sentinel.smarter.modules.presence.models.graphic.EmployeeContractWorkTypeGraph;
import com.sentinel.smarter.modules.presence.models.reference.GenderRef;
import com.sentinel.smarter.modules.presence.models.reference.WorkTypeRef;
import com.sentinel.smarter.modules.presence.models.view.EmployeeContractView;
import com.sentinel.smarter.modules.presence.payloads.request.EmployeeContractRequest;
import com.sentinel.smarter.modules.presence.repositories.EmployeeContractRepo;
import com.sentinel.smarter.modules.presence.repositories.graphic.EmployeeContractGenderGraphRepo;
import com.sentinel.smarter.modules.presence.repositories.graphic.EmployeeContractWorkTypeGraphRepo;
import com.sentinel.smarter.modules.presence.repositories.reference.GenderRefRepo;
import com.sentinel.smarter.modules.presence.repositories.reference.WorkTypeRefRepo;
import com.sentinel.smarter.modules.presence.repositories.view.EmployeeContractViewRepo;
import com.sentinel.smarter.modules.presence.services.EmployeeContractService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class EmployeeContractImpl implements EmployeeContractService {
    private ModelMap modelMap = new ModelMap();
    @Autowired
    private EmployeeContractViewRepo employeeContractViewRepo;
    @Autowired
    private GenderRefRepo genderRefRepo;
    @Autowired
    private WorkTypeRefRepo workTypeRefRepo;
    @Autowired
    private EmployeeContractRepo employeeContractRepo;
    @Autowired
    private EmployeeContractGenderGraphRepo employeeContractGenderGraphRepo;
    @Autowired
    private EmployeeContractWorkTypeGraphRepo employeeContractWorkTypeGraphRepo;

    //view

    @Override
    public Response findEmployeeContractViewByIDCompany(String id_perusahaan) {
        List<EmployeeContractView> employeeContractViews = employeeContractViewRepo.findEmployeeContractViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data pegawai kontrak ditemukan", employeeContractViews);
        return response;
    }

    @Override
    public Response findEmployeeContractViewByIDWorkPlace(String id_satuan_kerja) {
        List<EmployeeContractView> employeeContractViews = employeeContractViewRepo.findEmployeeContractViewByIDWorkPlace(id_satuan_kerja);
        Response response = new Response(HttpStatus.OK.value(),"data pegawai kontrak ditemukan", employeeContractViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan) {
        modelMap.clear();
        List<GenderRef> genderRefs = genderRefRepo.findGenderByIDCompany(id_perusahaan);
        modelMap.put("gender", genderRefs);
        List<WorkTypeRef> workTypeRefs = workTypeRefRepo.findWorkTypeByIDCompany(id_perusahaan);
        modelMap.put("worktype", workTypeRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getEmployeeContractByID(String id) {
        EmployeeContract employeeContract = employeeContractRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pegawai kontrak tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data pegawai kontrak ditemukan", employeeContract);
    }

    @Override
    public Response addEmployeeContract(EmployeeContractRequest request) {
        EmployeeContract employeeContract = new EmployeeContract();

        employeeContract.setID_perusahaan(request.getID_perusahaan());
        employeeContract.setID_satuan_kerja(request.getID_satuan_kerja());
        employeeContract.setNik(request.getNik());
        employeeContract.setNama(request.getNama());
        employeeContract.setID_jenis_kelamin(request.getID_jenis_kelamin());
        employeeContract.setTempat_lahir(request.getTempat_lahir());
        employeeContract.setTanggal_lahir(request.getTanggal_lahir());
        employeeContract.setAlamat(request.getAlamat());
        employeeContract.setSeluler(request.getSeluler());
        employeeContract.setID_jenis_kerja(request.getID_jenis_kerja());
        employeeContract.setFoto(request.getFoto());
        employeeContract.setID_pengguna(request.getID_pengguna());

        employeeContractRepo.save(employeeContract);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data pegawai kontrak berhasil disimpan");
        response.setData(null);
        return response;
    }

    @Override
    public Response updateEmployeeContractByID(String id, EmployeeContractRequest request) {
        EmployeeContract employeeContract = employeeContractRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pegawai kontrak tidak ditemukan");
        });

        employeeContract.setID_perusahaan(request.getID_perusahaan());
        employeeContract.setID_satuan_kerja(request.getID_satuan_kerja());
        employeeContract.setNik(request.getNik());
        employeeContract.setNama(request.getNama());
        employeeContract.setID_jenis_kelamin(request.getID_jenis_kelamin());
        employeeContract.setTempat_lahir(request.getTempat_lahir());
        employeeContract.setTanggal_lahir(request.getTanggal_lahir());
        employeeContract.setAlamat(request.getAlamat());
        employeeContract.setSeluler(request.getSeluler());
        employeeContract.setID_jenis_kerja(request.getID_jenis_kerja());
        employeeContract.setFoto(request.getFoto());
        employeeContract.setID_pengguna(request.getID_pengguna());

        employeeContractRepo.save(employeeContract);

        return new Response(HttpStatus.OK.value(), "data pegawai kontrak berhasil disimpan", null);
    }

    //graphic

    @Override
    public Response findEmployeeContractGenderGraphicByIDCompany(String id_perusahaan) {
        modelMap.clear();

        List<EmployeeContractGenderGraph> employeeContractGenderGraphs = employeeContractGenderGraphRepo.findEmployeeContractGenderGraphicByIDCompany(id_perusahaan);

        List<String> nama_jenis_kelamin = employeeContractGenderGraphs.stream()
        .map(item -> item.getNama_jenis_kelamin())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_jenis_kelamin);

        List<String> latar = employeeContractGenderGraphs.stream()
        .map(item -> item.getWarna_jenis_kelamin())
        .collect(Collectors.toList());
        modelMap.put("backgroundColor", latar);

        List<Long> jumlah = employeeContractGenderGraphs.stream()
        .map(item -> item.getJumlah())
        .collect(Collectors.toList());        
        modelMap.put("jumlah", jumlah);

        List<Double> persen = employeeContractGenderGraphs.stream()
        .map(item -> item.getPersen())
        .collect(Collectors.toList());        
        modelMap.put("persen", persen);

        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }

    @Override
    public Response findEmployeeContractWorkTypeGraphicByIDCompany(String id_perusahaan) {
        modelMap.clear();

        List<EmployeeContractWorkTypeGraph> employeeContractWorkTypeGraphs = employeeContractWorkTypeGraphRepo.findEmployeeContractWorkTypeGraphicByIDCompany(id_perusahaan);

        List<String> nama_jenis_keja = employeeContractWorkTypeGraphs.stream()
        .map(item -> item.getNama_jenis_kerja())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_jenis_keja);

        List<String> latar = employeeContractWorkTypeGraphs.stream()
        .map(item -> item.getWarna_jenis_kerja())
        .collect(Collectors.toList());
        modelMap.put("backgroundColor", latar);

        List<Long> jumlah = employeeContractWorkTypeGraphs.stream()
        .map(item -> item.getJumlah())
        .collect(Collectors.toList());        
        modelMap.put("jumlah", jumlah);

        List<Double> persen = employeeContractWorkTypeGraphs.stream()
        .map(item -> item.getPersen())
        .collect(Collectors.toList());        
        modelMap.put("persen", persen);

        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }

    //android

    @Override
    public Response findEmployeeContractViewByCardID(String nik) {
        List<EmployeeContractView> employeeContractViews = employeeContractViewRepo.findEmployeeContractViewByCardID(nik);
        Response response = new Response(HttpStatus.OK.value(),"data pegawai kontrak ditemukan", employeeContractViews);
        return response;
    }

    @Override
    public Response findEmployeeContractViewByID(String id) {
        List<EmployeeContractView> employeeContractViews = employeeContractViewRepo.findEmployeeContractViewByID(id);
        Response response = new Response(HttpStatus.OK.value(),"data pegawai kontrak ditemukan", employeeContractViews);
        return response;
    }
    
}
