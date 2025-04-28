package com.sentinel.smarter.modules.smarttask.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.view.DailyTaskView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface DailyTaskViewRepo extends ReadOnlyRepo<DailyTaskView,String> {
    @Query(value = "SELECT * FROM lan_dbstk.tugas_harian WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<DailyTaskView> findDailyTaskViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbstk.tugas_harian WHERE ID_PEGAWAI = ?1;", nativeQuery = true)
    List<DailyTaskView> findDailyTaskViewByIDEmployee(String id_pegawai);
}
