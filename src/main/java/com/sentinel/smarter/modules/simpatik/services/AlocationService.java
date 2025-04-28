package com.sentinel.smarter.modules.simpatik.services;

import com.sentinel.smarter.modules.simpatik.payloads.request.AlocationRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface AlocationService {
    //view
    Response findAclocationViewByIDCompany(String id_perusahaan);
    Response findAclocationViewByItemType(String id_perusahaan, String id_jenis_barang);
    Response findAclocationWorkUnitViewByIDCompany(String id_perusahaan);
    Response findAlocationByIDWorkUnit(String id_perusahaan, String id_jenis_barang, String id_satuan_keja);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan, String id_jenis_barang);
    //control
    Response getAlocationByID(String id);
    Response addAlocation(AlocationRequest request);
    Response updateAlocationByID(String id, AlocationRequest request);
}
