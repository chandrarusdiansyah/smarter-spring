package com.sentinel.smarter.modules.supplies.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.supplies.models.view.ItemItemTypeView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ItemItemTypeViewRepo extends ReadOnlyRepo<ItemItemTypeView,String>{
    @Query(value = "SELECT * FROM lan_dbspl.barang_jenis_barang WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ItemItemTypeView> findItemItemTypeViewByIDCompany(String id_perusahaan);
}
