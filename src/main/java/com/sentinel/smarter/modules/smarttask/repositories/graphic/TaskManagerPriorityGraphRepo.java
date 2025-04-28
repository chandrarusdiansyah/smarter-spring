package com.sentinel.smarter.modules.smarttask.repositories.graphic;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerPriorityGraph;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskManagerPriorityGraphRepo extends ReadOnlyRepo<TaskManagerPriorityGraph,String> {
    @Query(value = "SELECT a.NAMA_TUGAS_PRIORITAS, SUM(CASE WHEN a.ID_TUGAS_STATUS=3 THEN 1 ELSE 0 END) AS DONE, SUM(CASE WHEN a.ID_TUGAS_STATUS<>3 THEN 1 ELSE 0 END) AS ONGOING FROM lan_dbstk.tugas a WHERE a.ID_PERUSAHAAN = ?1 GROUP BY a.ID_TUGAS_PRIORITAS", nativeQuery = true)
    List<TaskManagerPriorityGraph> findTaskManagerPriorityGraphicByIDCompany(String id_perusahaan);
}
