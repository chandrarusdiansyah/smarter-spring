package com.sentinel.smarter.modules.smarttask.services;

import com.sentinel.smarter.modules.smarttask.payloads.request.TaskManagerRequest;
import com.sentinel.smarter.payloads.response.Response;

public interface TaskManagerService {
    //view
    Response findTaskManagerViewByIDCompany(String id_perusahaan);
    Response findTaskManagerViewByIDEmployee(String id_pegawai);
    Response findTaskManagerViewByIDTaskManagerStatus(String id_perusahaan, String id_tugas_status);
    Response findTaskManagerViewOverdue(String id_perusahaan);
    //reference
    Response findReferenceByIDCompany(String id_perusahaan);
    //control
    Response getTaskManagerByID(String id);
    Response addTaskManager(TaskManagerRequest request);
    Response updateTaskManagerByID(String id, TaskManagerRequest request);
    //graphic
    Response findTaskManagerStatusGraphicByIDCompany(String id_perusahaan);
    Response findTaskManagerPriorityGraphicByIDCompany(String id_perusahaan);
    Response findTaskManagerDivisionGraphicByIDCompany(String id_perusahaan);
    Response findTaskManagerWorkPlaceGraphicByIDCompany(String id_perusahaan);
}
