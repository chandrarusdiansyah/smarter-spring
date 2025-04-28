package com.sentinel.smarter.modules.smarttask.implementations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sentinel.smarter.models.view.EmployeeView;
import com.sentinel.smarter.modules.smarttask.models.Project;
import com.sentinel.smarter.modules.smarttask.models.TaskManager;
import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerDivisionGraph;
import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerPriorityGraph;
import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerStatusGraph;
import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerWorkPlaceGraph;
import com.sentinel.smarter.modules.smarttask.models.reference.TaskPriorityRef;
import com.sentinel.smarter.modules.smarttask.models.reference.TaskStatusRef;
import com.sentinel.smarter.modules.smarttask.models.view.TaskManagerView;
import com.sentinel.smarter.modules.smarttask.payloads.request.TaskManagerRequest;
import com.sentinel.smarter.modules.smarttask.repositories.ProjectRepo;
import com.sentinel.smarter.modules.smarttask.repositories.TaskManagerRepo;
import com.sentinel.smarter.modules.smarttask.repositories.graphic.TaskManagerDivisionGraphRepo;
import com.sentinel.smarter.modules.smarttask.repositories.graphic.TaskManagerPriorityGraphRepo;
import com.sentinel.smarter.modules.smarttask.repositories.graphic.TaskManagerStatusGraphRepo;
import com.sentinel.smarter.modules.smarttask.repositories.graphic.TaskManagerWorkPlaceGraphRepo;
import com.sentinel.smarter.modules.smarttask.repositories.reference.TaskPriorityRefRepo;
import com.sentinel.smarter.modules.smarttask.repositories.reference.TaskStatusRefRepo;
import com.sentinel.smarter.modules.smarttask.repositories.view.TaskManagerViewRepo;
import com.sentinel.smarter.modules.smarttask.services.TaskManagerService;
import com.sentinel.smarter.payloads.response.Response;
import com.sentinel.smarter.repositories.view.EmployeeViewRepo;

@Service
public class TaskManagerImpl implements TaskManagerService {

    private ModelMap modelMap = new ModelMap();

    @Autowired
    private TaskManagerViewRepo taskManagerViewRepo;
    @Autowired
    private ProjectRepo projectRepo;
    @Autowired
    private EmployeeViewRepo employeeViewRepo;
    @Autowired
    private TaskPriorityRefRepo taskPriorityRefRepo;
    @Autowired
    private TaskStatusRefRepo taskStatusRefRepo;
    @Autowired
    private TaskManagerRepo taskManagerRepo;
    @Autowired
    private TaskManagerStatusGraphRepo taskManagerStatusGraphRepo;
    @Autowired
    private TaskManagerPriorityGraphRepo taskManagerPriorityGraphRepo;
    @Autowired
    private TaskManagerDivisionGraphRepo taskManagerDivisionGraphRepo;
    @Autowired
    private TaskManagerWorkPlaceGraphRepo taskManagerWorkPlaceGraphRepo;

    //view

    public Response findTaskManagerViewByIDCompany(String id_perusahaan){
        List<TaskManagerView> taskManagerViews = taskManagerViewRepo.findTaskManagerViewByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data task manager ditemukan", taskManagerViews);
        return response;
    }

    public Response findTaskManagerViewByIDEmployee(String id_pegawai){
        List<TaskManagerView> taskManagerViews = taskManagerViewRepo.findTaskManagerViewByIDEmployee(id_pegawai);
        Response response = new Response(HttpStatus.OK.value(),"data task manager ditemukan", taskManagerViews);
        return response;
    }

    public Response findTaskManagerViewByIDTaskManagerStatus(String id_perusahaan, String id_tugas_status){
        List<TaskManagerView> taskManagerViews = taskManagerViewRepo.findTaskManagerViewByIDTaskManagerStatus(id_perusahaan, id_tugas_status);
        Response response = new Response(HttpStatus.OK.value(),"data task manager ditemukan", taskManagerViews);
        return response;
    }

    public Response findTaskManagerViewOverdue(String id_perusahaan){
        List<TaskManagerView> taskManagerViews = taskManagerViewRepo.findTaskManagerViewOverdue(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data task manager ditemukan", taskManagerViews);
        return response;
    }

    //reference

    @Override
    public Response findReferenceByIDCompany(String id_perusahaan){
        modelMap.clear();
        List<Project> projects = projectRepo.findProjectByIDCompany(id_perusahaan);
        modelMap.put("project", projects);
        List<EmployeeView> employeeViews = employeeViewRepo.findEmployeeViewByIDCompany(id_perusahaan);
        modelMap.put("employee", employeeViews);
        List<TaskPriorityRef> taskPriorityRefs = taskPriorityRefRepo.findTaskPriorityByIDCompany(id_perusahaan);
        modelMap.put("taskpriority", taskPriorityRefs);
        List<TaskStatusRef> taskStatusRefs = taskStatusRefRepo.findTaskStatusByIDCompany(id_perusahaan);
        modelMap.put("taskstatus", taskStatusRefs);
        Response response = new Response(HttpStatus.OK.value(),"data referensi ditemukan", modelMap);
        return response;
    }

    //control

    @Override
    public Response getTaskManagerByID(String id){
        TaskManager taskManager = taskManagerRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data task manager tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data task manager ditemukan", taskManager);
    }

    @Override
    public Response addTaskManager(TaskManagerRequest request){
        TaskManager taskManager = new TaskManager();
        taskManager.setID_perusahaan(request.getID_perusahaan());
        taskManager.setID_proyek(request.getID_proyek());
        taskManager.setTugas(request.getTugas());
        taskManager.setID_pegawai(request.getID_pegawai());
        taskManager.setID_tugas_prioritas(request.getID_tugas_prioritas());
        taskManager.setTgl_mulai(request.getTgl_mulai());
        taskManager.setTgl_selesai(request.getTgl_selesai());
        taskManager.setID_tugas_status(request.getID_tugas_status());
        taskManager.setKeterangan(request.getKeterangan());
        taskManager.setID_pengguna(request.getID_pengguna());

        taskManagerRepo.save(taskManager);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data task manager berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateTaskManagerByID(String id, TaskManagerRequest request){
        TaskManager taskManager = taskManagerRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data task manager tidak ditemukan");
        });

        taskManager.setID_perusahaan(request.getID_perusahaan());
        taskManager.setID_proyek(request.getID_proyek());
        taskManager.setTugas(request.getTugas());
        taskManager.setID_pegawai(request.getID_pegawai());
        taskManager.setID_tugas_prioritas(request.getID_tugas_prioritas());
        taskManager.setTgl_mulai(request.getTgl_mulai());
        taskManager.setTgl_selesai(request.getTgl_selesai());
        taskManager.setID_tugas_status(request.getID_tugas_status());
        taskManager.setKeterangan(request.getKeterangan());
        taskManager.setID_pengguna(request.getID_pengguna());

        taskManagerRepo.save(taskManager);

        return new Response(HttpStatus.OK.value(), "data task manager berhasil disimpan", null);
    }

    //graphic

    @Override
    public Response findTaskManagerStatusGraphicByIDCompany(String id_perusahaan){
        modelMap.clear();

        List<TaskManagerStatusGraph> taskManagerStatusGraphs = taskManagerStatusGraphRepo.findTaskManagerStatusGraphicByIDCompany(id_perusahaan);

        List<String> nama_status = taskManagerStatusGraphs.stream()
        .map(item -> item.getNama_tugas_status())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_status);

        List<String> latar = taskManagerStatusGraphs.stream()
        .map(item -> item.getWarna_tugas_status())
        .collect(Collectors.toList());
        modelMap.put("backgroundColor", latar);

        List<Long> jumlah = taskManagerStatusGraphs.stream()
        .map(item -> item.getJumlah())
        .collect(Collectors.toList());        
        modelMap.put("jumlah", jumlah);

        List<Double> persen = taskManagerStatusGraphs.stream()
        .map(item -> item.getPersen())
        .collect(Collectors.toList());        
        modelMap.put("persen", persen);

        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }

    @Override
    public Response findTaskManagerPriorityGraphicByIDCompany(String id_perusahaan){
        modelMap.clear();
      
        List<TaskManagerPriorityGraph> taskManagerPriorityGraphs = taskManagerPriorityGraphRepo.findTaskManagerPriorityGraphicByIDCompany(id_perusahaan);

        List<String> nama_prioritas = taskManagerPriorityGraphs.stream()
        .map(item -> item.getNama_tugas_prioritas())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_prioritas);

        List<Long> done = taskManagerPriorityGraphs.stream()
        .map(item -> item.getDone())
        .collect(Collectors.toList());        
        modelMap.put("done", done);

        List<Long> ongoing = taskManagerPriorityGraphs.stream()
        .map(item -> item.getOnGoing())
        .collect(Collectors.toList());        
        modelMap.put("ongoing", ongoing);
        
        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }

    @Override
    public Response findTaskManagerDivisionGraphicByIDCompany(String id_perusahaan){
        modelMap.clear();
      
        List<TaskManagerDivisionGraph> taskManagerDivisionGraphs = taskManagerDivisionGraphRepo.findTaskManagerDivisionGraphicByIDCompany(id_perusahaan);

        List<String> nama_divisi = taskManagerDivisionGraphs.stream()
        .map(item -> item.getNama_divisi())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_divisi);

        List<Long> done = taskManagerDivisionGraphs.stream()
        .map(item -> item.getDone())
        .collect(Collectors.toList());        
        modelMap.put("done", done);

        List<Long> ongoing = taskManagerDivisionGraphs.stream()
        .map(item -> item.getOnGoing())
        .collect(Collectors.toList());        
        modelMap.put("ongoing", ongoing);
        
        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }

    @Override
    public Response findTaskManagerWorkPlaceGraphicByIDCompany(String id_perusahaan){
        modelMap.clear();
      
        List<TaskManagerWorkPlaceGraph> taskManagerWorkPlaceGraphs = taskManagerWorkPlaceGraphRepo.findTaskManagerWorkPlaceGraphicByIDCompany(id_perusahaan);

        List<String> nama_satuan_kerja = taskManagerWorkPlaceGraphs.stream()
        .map(item -> item.getNama_satuan_kerja())
        .collect(Collectors.toList());

        modelMap.put("labels", nama_satuan_kerja);

        List<Long> done = taskManagerWorkPlaceGraphs.stream()
        .map(item -> item.getDone())
        .collect(Collectors.toList());        
        modelMap.put("done", done);

        List<Long> ongoing = taskManagerWorkPlaceGraphs.stream()
        .map(item -> item.getOnGoing())
        .collect(Collectors.toList());        
        modelMap.put("ongoing", ongoing);
        
        Response response = new Response(HttpStatus.OK.value(),"data graphic ditemukan", modelMap);
        return response;
    }
}
