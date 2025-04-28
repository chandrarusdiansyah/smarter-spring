package com.sentinel.smarter.services;

import com.sentinel.smarter.payloads.request.EmployeeRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface EmployeeService {
    //view
    Response findEmployeeViewByIDCompany(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getEmployeeByID(String id);
    Response addEmployee(EmployeeRequest request);
    Response updateEmployeeByID(String id,EmployeeRequest request);
}
