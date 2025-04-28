package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.WorkPlaceRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface WorkPlaceService {
    //list
    Response findWorkPlaceByIDCompany(String id_perusahaan);
    //control
    Response getWorkPlaceByID(String id);
    Response addWorkPlace(WorkPlaceRequest request);
    Response updateWorkPlaceByID(String id, WorkPlaceRequest request);
}
