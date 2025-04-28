package com.sentinel.smarter.modules.pelita.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.pelita.models.view.OrderView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface OrderViewRepo extends ReadOnlyRepo<OrderView,String> {
    @Query(value = "SELECT * FROM lan_dbplt.pesan WHERE ID_PERUSAHAAN = ?1 ORDER BY ID DESC;", nativeQuery = true)
    List<OrderView> findOrderViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbplt.pesan WHERE ID = ?1;", nativeQuery = true)
    OrderView findOrderViewByID(String id_pesan);
}
