package com.sentinel.smarter.modules.simpatik.services;

import com.sentinel.smarter.modules.simpatik.payloads.request.AssetRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface AssetService {
    //view
    Response findAssetByIDCompany(String id_perusahaan);
    Response findAssetViewByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response addAsset(AssetRequest request);
    Response getAssetByID(String id);
    Response updateAssetByID(String id, AssetRequest request);
    Response deleteAssetByID(String id);
}
