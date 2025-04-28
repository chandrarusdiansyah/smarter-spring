package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.MeansCalendarWeekView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface MeansCalendarWeekViewRepo extends ReadOnlyRepo<MeansCalendarWeekView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.sarana_kalender_minggu WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<MeansCalendarWeekView> findMeansCalendarWeekViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.sarana_kalender_minggu WHERE ID_PERUSAHAAN = ?1 AND ID_SARANA=?2;", nativeQuery = true)
    List<MeansCalendarWeekView> findMeansCalendarWeekViewByIDMeans(String id_perusahaan, String id_sarana);
}
