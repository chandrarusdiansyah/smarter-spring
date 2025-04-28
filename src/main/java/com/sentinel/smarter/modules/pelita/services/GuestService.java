package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.GuestRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface GuestService {
    //view
    Response findGuestViewByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getGuestByID(String id);
    Response addGuest(GuestRequest request);
    Response updateGuestByID(String id, GuestRequest request);
}
