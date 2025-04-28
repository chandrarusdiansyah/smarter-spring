package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.DivisionRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface DivisionService {
    //list
    Response findDivisionByIDCompany(String id_perusahaan);
    //control
    Response getDivisionByID(String id);
    Response addDivision(DivisionRequest request);
    Response updateDivisionByID(String id,DivisionRequest request);
}
