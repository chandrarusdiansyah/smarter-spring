package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.InfrastructureRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface InfrastructureService {
    //view
    Response findInfrastructureViewByIDCompany(String id_perusahaan);
    Response findInfrastructureViewAvailable(String id_perusahaan);
    Response findInfrastructureConditionViewByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getInfrastructureByID(String id);
    Response addInfrastructure(InfrastructureRequest request);
    Response updateInfrastructureByID(String id, InfrastructureRequest request);
}
