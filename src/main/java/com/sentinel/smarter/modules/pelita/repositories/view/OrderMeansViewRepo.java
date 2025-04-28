package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.OrderMeansView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface OrderMeansViewRepo extends ReadOnlyRepo<OrderMeansView,String>{
    @Query(value = "SELECT * FROM lan_dbplt.pesan_sarana WHERE ID_PESAN = ?1;", nativeQuery = true)
    List<OrderMeansView> findOrderMeansViewByIDOrder(String id_pesan);

    @Query(value = "SELECT * FROM lan_dbplt.pesan_sarana WHERE ID_PERUSAHAAN = ?1 AND TANGGAL = ?2;", nativeQuery = true)
    List<OrderMeansView> findOrderMeansViewBySingeDate(String id_perusahaan, String tanggal);
}
