package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.OrderInfrastructureView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface OrderInfrastructureViewRepo extends ReadOnlyRepo<OrderInfrastructureView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.pesan_prasarana WHERE ID_PESAN = ?1;", nativeQuery = true)
    List<OrderInfrastructureView> findOrderInfrastructureViewByIDOrder(String id_pesan);

    @Query(value = "SELECT * FROM lan_dbplt.pesan_prasarana WHERE ID_PERUSAHAAN = ?1 AND TANGGAL = ?2;", nativeQuery = true)
    List<OrderInfrastructureView> findOrderInfrastructureViewBySingeDate(String id_perusahaan, String tanggal);
}
