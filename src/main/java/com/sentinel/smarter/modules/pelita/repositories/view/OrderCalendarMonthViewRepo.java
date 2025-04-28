package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.OrderCalendarMonthView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface OrderCalendarMonthViewRepo extends ReadOnlyRepo<OrderCalendarMonthView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.pesan_kalender_bulan WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<OrderCalendarMonthView> findOrderCalendarMonthViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.pesan_kalender_bulan WHERE ID_PERUSAHAAN = ?1 AND ID_SATUAN_KERJA = ?2;", nativeQuery = true)
    List<OrderCalendarMonthView> findOrderCalendarMonthViewByIDWorkPlace(String id_perusahaan, String id_satuan_kerja);
}
