package com.sentinel.smarter.modules.presence.services;

import com.sentinel.smarter.modules.presence.payloads.request.PresenceRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface PresenceService {
    //view
    Response findPresenceByQuery(String query);
    Response findPresenceByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getPresencetByID(String id);
    Response addPresence(PresenceRequest request);
    Response updatePresenceByID(String id,PresenceRequest request);
    Response deletePresenceByID(String id);
    //android
    Response findPresenceByIDEmployeeContract(String id);
    Response addPresenceIn(PresenceRequest request);
    Response addPresenceOut(String id,PresenceRequest request);
    Response findPresenceTodayByIDEmployeeContract(String id);
}
