package com.sentinel.smarter.modules.smarttask.services;

import com.sentinel.smarter.modules.smarttask.payloads.request.DailyTaskRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface DailyTaskService {
    //view
    Response findDailyTaskViewByIDCompany(String id_perusahaan);
    Response findDailyTaskViewByIDEmployee(String id_pegawai);
    //control
    Response getDailyTaskByID(String id);
    Response addDailyTask(DailyTaskRequest request);
    Response updateDailyTasktByID(String id, DailyTaskRequest request);
}
