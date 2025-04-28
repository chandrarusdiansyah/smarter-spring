package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.WorkUnitRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface WorkUnitService {
    //list
    Response findWorkUnitByIDCompany(String id_perusahaan);
    //control
    Response getWorkUnitByID(String id);
    Response addWorkUnit(WorkUnitRequest request);
    Response updateWorkUnitByID(String id, WorkUnitRequest request);
}
