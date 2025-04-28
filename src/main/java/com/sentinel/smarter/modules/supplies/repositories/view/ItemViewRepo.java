package com.sentinel.smarter.modules.supplies.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.view.ItemView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ItemViewRepo extends ReadOnlyRepo<ItemView,String> {
    @Query(value = "SELECT * FROM lan_dbspl.barang WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ItemView> findItemViewByIDCompany(String id_perusahaan);
}
