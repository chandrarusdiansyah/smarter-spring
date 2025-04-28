package com.sentinel.smarter.modules.smarttask.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.view.TaskManagerView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskManagerViewRepo extends ReadOnlyRepo<TaskManagerView,String>{
    @Query(value = "SELECT * FROM lan_dbstk.tugas WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<TaskManagerView> findTaskManagerViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbstk.tugas WHERE ID_PEGAWAI = ?1", nativeQuery = true)
    List<TaskManagerView> findTaskManagerViewByIDEmployee(String id_pegawai);

    @Query(value = "SELECT * FROM lan_dbstk.tugas WHERE ID_PERUSAHAAN = ?1 AND ID_TUGAS_STATUS = ?2", nativeQuery = true)
    List<TaskManagerView> findTaskManagerViewByIDTaskManagerStatus(String id_perusahaan, String id_tugas_status);

    @Query(value = "SELECT * FROM lan_dbstk.tugas WHERE ID_PERUSAHAAN = ?1 AND ID_TUGAS_STATUS <> 3 AND TGL_SELESAI<DATE(NOW())", nativeQuery = true)
    List<TaskManagerView> findTaskManagerViewOverdue(String id_perusahaan);
}
