package com.sentinel.smarter.modules.smarttask.repositories.graphic;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerStatusGraph;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskManagerStatusGraphRepo extends ReadOnlyRepo<TaskManagerStatusGraph,String> {
    @Query(value = "SELECT a.NAMA_TUGAS_STATUS, a.WARNA_TUGAS_STATUS, COUNT(*) AS JUMLAH, ROUND((COUNT(*)/((SELECT COUNT(*) FROM lan_dbstk.tugas x WHERE x.ID_PERUSAHAAN=a.ID_PERUSAHAAN)/100)),2) AS PERSEN FROM lan_dbstk.tugas a WHERE a.ID_PERUSAHAAN = ?1 GROUP BY a.ID_TUGAS_STATUS", nativeQuery = true)
    List<TaskManagerStatusGraph> findTaskManagerStatusGraphicByIDCompany(String id_perusahaan);
}
