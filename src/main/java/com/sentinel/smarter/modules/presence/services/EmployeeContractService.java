package com.sentinel.smarter.modules.presence.services;

import com.sentinel.smarter.modules.presence.payloads.request.EmployeeContractRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface EmployeeContractService {
    //view
    Response findEmployeeContractViewByIDCompany(String id_perusahaan);
    Response findEmployeeContractViewByIDWorkPlace(String id_satuan_kerja);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getEmployeeContractByID(String id);
    Response addEmployeeContract(EmployeeContractRequest request);
    Response updateEmployeeContractByID(String id,EmployeeContractRequest request);
    //graphic
    Response findEmployeeContractGenderGraphicByIDCompany(String id_perusahaan);
    Response findEmployeeContractWorkTypeGraphicByIDCompany(String id_perusahaan);
    //android
    Response findEmployeeContractViewByCardID(String nik);
    Response findEmployeeContractViewByID(String id);
}
