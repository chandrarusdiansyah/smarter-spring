package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.InfrastructureCalendarWeekView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface InfrastructureCalendarWeekViewRepo extends ReadOnlyRepo<InfrastructureCalendarWeekView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.prasarana_kalender_minggu WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<InfrastructureCalendarWeekView> findInfrastructureCalendarWeekViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.prasarana_kalender_minggu WHERE ID_PERUSAHAAN = ?1 AND ID_PRASARANA=?2;", nativeQuery = true)
    List<InfrastructureCalendarWeekView> findInfrastructureCalendarWeekViewByIDInfrastructure(String id_perusahaan, String id_prasarana);

    @Query(value = "SELECT * FROM lan_dbplt.prasarana_kalender_minggu WHERE ID_PERUSAHAAN = ?1 AND ID_SATUAN_KERJA = ?2;", nativeQuery = true)
    List<InfrastructureCalendarWeekView> findInfrastructureCalendarWeekViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja);
}
