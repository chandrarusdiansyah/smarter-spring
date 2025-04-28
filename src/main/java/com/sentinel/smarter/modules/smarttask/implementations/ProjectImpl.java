package com.sentinel.smarter.modules.smarttask.implementations;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sentinel.smarter.modules.smarttask.models.Project;
import com.sentinel.smarter.modules.smarttask.payloads.request.ProjectRequest;
import com.sentinel.smarter.modules.smarttask.repositories.ProjectRepo;
import com.sentinel.smarter.modules.smarttask.services.ProjectService;
import com.sentinel.smarter.payloads.response.Response;

@Service
public class ProjectImpl implements ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    //list

    public Response findProjectByIDCompany(String id_perusahaan){
        List<Project> projects = projectRepo.findProjectByIDCompany(id_perusahaan);
        Response response = new Response(HttpStatus.OK.value(),"data proyek ditemukan", projects);
        return response;
    }

    //control

    @Override
    public Response getProjectByID(String id){
        Project project = projectRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data proyek tidak ditemukan");
        });
        return new Response(HttpStatus.OK.value(), "data proyek ditemukan", project);
    }

    @Override
    public Response addProject(ProjectRequest request){
        Project project = new Project();

        project.setID_perusahaan(request.getID_perusahaan());
        project.setKode(request.getKode());
        project.setNama(request.getNama());
        project.seKeterangan(request.getKeterangan());
        project.setID_pengguna(request.getID_pengguna());

        projectRepo.save(project);

        Response response = new Response();
        response.setStatus(HttpStatus.CREATED.value());
        response.setMessage("data proyek berhasil disimpan");
        response.setData(null);

        return response;
    }

    @Override
    public Response updateProjectByID(String id, ProjectRequest request){
        Project project = projectRepo.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("data proyek tidak ditemukan");
        });
        
        project.setID_perusahaan(request.getID_perusahaan());
        project.setKode(request.getKode());
        project.setNama(request.getNama());
        project.seKeterangan(request.getKeterangan());
        project.setID_pengguna(request.getID_pengguna());

        projectRepo.save(project);

        return new Response(HttpStatus.OK.value(), "data proyek berhasil disimpan", null);
    }

}
