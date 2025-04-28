package com.sentinel.smarter.modules.smarttask.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.smarttask.models.DailyTask;
import com.sentinel.smarter.modules.smarttask.models.view.DailyTaskView;
import com.sentinel.smarter.modules.smarttask.payloads.request.DailyTaskRequest;
import com.sentinel.smarter.modules.smarttask.repositories.DailyTaskRepo;
import com.sentinel.smarter.modules.smarttask.repositories.view.DailyTaskViewRepo;
import com.sentinel.smarter.modules.smarttask.services.DailyTaskService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class DailyTaskImpl implements DailyTaskService {
    @Autowired
    private DailyTaskViewRepo dailyTaskViewRepo;
    @Autowired
    private DailyTaskRepo dailyTaskRepo;

    //view

    public Response findDailyTaskViewByIDCompany(String id_perusahaan){
        List<DailyTaskView> dailyTaskViews = dailyTaskViewRepo.findDailyTaskViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data daily task ditemukan", dailyTaskViews);
        return response;
    }   

    public Response findDailyTaskViewByIDEmployee(String id_pegawai){
        List<DailyTaskView> dailyTaskViews = dailyTaskViewRepo.findDailyTaskViewByIDEmployee(id_pegawai);
        Response response = new Response(HttpStatus.OK.value(),"data daily task ditemukan", dailyTaskViews);
        return response;
    }   

    //control

    @Override
    public Response getDailyTaskByID(String id){
        DailyTask dailyTask = dailyTaskRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data daily task tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data daily task ditemukan", dailyTask);
    }

    @Override
    public Response addDailyTask(DailyTaskRequest request){
        DailyTask dailyTask = new DailyTask();

        dailyTask.setID_perusahaan(request.getID_perusahaan());
        dailyTask.setTanggal(request.getTanggal());
        dailyTask.setID_tugas(request.getID_tugas());
        dailyTask.setKegiatan(request.getKegiatan());
        dailyTask.setKeterangan(request.getKeterangan());
        dailyTask.setID_pengguna(request.getID_pengguna());

        dailyTaskRepo.save(dailyTask);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data daily task berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateDailyTasktByID(String id, DailyTaskRequest request){
        DailyTask dailyTask = dailyTaskRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data daily task tidak ditemukan");
        });
        
        dailyTask.setID_perusahaan(request.getID_perusahaan());
        dailyTask.setTanggal(request.getTanggal());
        dailyTask.setID_tugas(request.getID_tugas());
        dailyTask.setKegiatan(request.getKegiatan());
        dailyTask.setKeterangan(request.getKeterangan());
        dailyTask.setID_pengguna(request.getID_pengguna());

        dailyTaskRepo.save(dailyTask);

        return new Response(HttpStatus.OK.value(), "data daily task berhasil disimpan", null);
    }
}
