package com.sentinel.smarter.modules.smartproc.services;

import com.sentinel.smarter.modules.smartproc.payloads.request.PartnerRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface PartnerService {
    //list
    Response findPartnerByIDCompany(String id_perusahaan);
    //control
    Response getPartnerByID(String id);
    Response addPartner(PartnerRequest request);
    Response updatePartnerByID(String id,PartnerRequest request);
}
