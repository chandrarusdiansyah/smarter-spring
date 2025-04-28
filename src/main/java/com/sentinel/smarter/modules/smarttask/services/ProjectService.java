package com.sentinel.smarter.modules.smarttask.services;

import com.sentinel.smarter.modules.smarttask.payloads.request.ProjectRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface ProjectService {
    //list
    Response findProjectByIDCompany(String id_perusahaan);
    //control
    Response getProjectByID(String id);
    Response addProject(ProjectRequest request);
    Response updateProjectByID(String id,ProjectRequest request);
}
