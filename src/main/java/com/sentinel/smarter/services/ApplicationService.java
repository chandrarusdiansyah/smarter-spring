package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.ApplicationRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface ApplicationService {
    //list
    Response findApplicationByIDCompany(String id_perusahaan);
    //control
    Response getApplicationByID(String id);
    Response addApplication(ApplicationRequest request);
    Response updateApplicationByID(String id, ApplicationRequest request);
}
