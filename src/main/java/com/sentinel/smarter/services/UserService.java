package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.UserRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface UserService {
    //view
    Response findUserByIDCompany(String id_perusahaan);
    Response findUserAccessByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getUserByID(String id);
    Response updateUserByID(String id, UserRequest request);
}
