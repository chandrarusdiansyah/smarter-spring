package com.sentinel.smarter.modules.smartproc.services;

import com.sentinel.smarter.modules.smartproc.payloads.request.HandOverRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface HandOverService {
    //view
    Response findHandOverByIDCompany(String id_perusahaan);
    Response findHandOverByIDContract(String id_perusahaan, String id_kontrak);
    //control
    Response getHandOverByID(String id);
    Response addHandOver(HandOverRequest request);
    Response updateHandOverByID(String id,HandOverRequest request);
    Response deleteHandOverByID(String id);
}
