package com.sentinel.smarter.modules.pelita.services;

import com.sentinel.smarter.modules.pelita.payloads.request.MeansRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface MeansService {
    //view
    Response findMeansViewByIDCompany(String id_perusahaan);
    Response findMeansViewAvailable(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getMeansByID(String id);
    Response addMeans(MeansRequest request);
    Response updateMeansByID(String id, MeansRequest request);
}
