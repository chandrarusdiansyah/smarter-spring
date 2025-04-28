package com.sentinel.smarter.implamentations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.Application;
import com.sentinel.smarter.models.User;
import com.sentinel.smarter.models.UserType;
import com.sentinel.smarter.models.view.EmployeeView;
import com.sentinel.smarter.models.view.UserAccessView;
import com.sentinel.smarter.models.view.UserView;
import com.sentinel.smarter.payloads.request.UserRequest;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.ApplicationRepo;
import com.sentinel.smarter.repositories.UserRepo;
import com.sentinel.smarter.repositories.UserTypeRepo;
import com.sentinel.smarter.repositories.view.EmployeeViewRepo;
import com.sentinel.smarter.repositories.view.UserAccessViewRepo;
import com.sentinel.smarter.repositories.view.UserViewRepo;
import com.sentinel.smarter.services.UserService;

@Service
public class UserImpl implements UserService {

    private ModelMap modelMap = new ModelMap();

    @Autowired
    UserViewRepo userViewRepo;
    @Autowired
    UserAccessViewRepo userAccessViewRepo;
    @Autowired
    private ApplicationRepo applicationRepo;
    @Autowired
    UserTypeRepo userTypeRepo;
    @Autowired
    private EmployeeViewRepo employeeViewRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    PasswordEncoder encoder;

    //view

    @Override
    public Response findUserByIDCompany(String id_perusahaan){
        List<UserView> userViews = userViewRepo.findUserByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data pengguna ditemukan", userViews);
        return response;
    }

    @Override
    public Response findUserAccessByIDCompany(String id_perusahaan){
        List<UserAccessView> userAccessViews = userAccessViewRepo.findUserAccessByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data pengguna ditemukan", userAccessViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<Application> applications = applicationRepo.findApplicationByIDCompany(id_perusahaan);
        modelMap.put("application", applications);
        List<UserType> userTypes = userTypeRepo.findUserTypeByIDCompany(id_perusahaan);
        modelMap.put("usertype", userTypes);
        List<EmployeeView> employeeViews = employeeViewRepo.findEmployeeViewByIDCompany(id_perusahaan);
        modelMap.put("employee", employeeViews);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getUserByID(String id){
        User user = userRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pengguna tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data pengguna ditemukan", user);
    }

    @Override
    public Response updateUserByID(String id, UserRequest request){
        User user = userRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data pengguna tidak ditemukan");
        });
        
        user.setID_perusahaan(request.getID_perusahaan());
        user.setID_aplikasi(request.getID_aplikasi());
        user.setID_jenis_pengguna(request.getID_jenis_pengguna());
        user.setID_pegawai(request.getID_pegawai());
        user.setNama_pengguna(request.getNama_pengguna());
        user.setKata_sandi(encoder.encode(request.getKata_sandi()));
        user.setIp_registrasi(request.getIp_registrasi());
        user.setID_pengguna(request.getID_pengguna());

        userRepo.save(user);

        return new Response(HttpStatus.OK.value(), "data pengguna berhasil disimpan", null);
    }
}
