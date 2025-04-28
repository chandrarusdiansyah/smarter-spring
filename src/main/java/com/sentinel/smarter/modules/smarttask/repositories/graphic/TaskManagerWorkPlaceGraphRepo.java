package com.sentinel.smarter.modules.smarttask.repositories.graphic;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smarttask.models.graphic.TaskManagerWorkPlaceGraph;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface TaskManagerWorkPlaceGraphRepo extends ReadOnlyRepo<TaskManagerWorkPlaceGraph,String> {
    @Query(value = "SELECT IFNULL(a.NAMA_SATUAN_KERJA,'') AS NAMA_SATUAN_KERJA, SUM(CASE WHEN a.ID_TUGAS_STATUS=3 THEN 1 ELSE 0 END) AS DONE, SUM(CASE WHEN a.ID_TUGAS_STATUS<>3 THEN 1 ELSE 0 END) AS ONGOING FROM lan_dbstk.tugas a WHERE a.ID_PERUSAHAAN = ?1 GROUP BY a.ID_SATUAN_KERJA", nativeQuery = true)
    List<TaskManagerWorkPlaceGraph> findTaskManagerWorkPlaceGraphicByIDCompany(String id_perusahaan);
}
