package com.sentinel.smarter.modules.smartproc.services;

import com.sentinel.smarter.modules.smartproc.payloads.request.ContractRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface ContractService {
    //view
    Response findContractByIDCompany(String id_perusahaan);
    Response findContractByIDContractType(String id_perusahaan, String id_jenis_kontrak);
    Response findContractContractTypeViewByIDCompany(String id_perusahaan);
    Response findContractWorkPlaceViewByIDCompany(String id_perusahaan);
    Response findContractValueWorkPlaceViewByIDCompany(String id_perusahaan);
    Response findContractNotFinished(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getContractByID(String id);
    Response addContract(ContractRequest request);
    Response updateContractByID(String id,ContractRequest request);
}
