package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.PositionRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface PositionService {
    //list
    Response findPositionByIDCompany(String id_perusahaan);
    //control
    Response getPositionByID(String id);
    Response addPosition(PositionRequest request);
    Response updatePositionByID(String id,PositionRequest request);
}
