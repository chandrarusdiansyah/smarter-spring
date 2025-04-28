package com.sentinel.smarter.modules.simpatik.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.simpatik.models.reference.AssetConditionRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface AssetConditionRefRepo extends ReadOnlyRepo<AssetConditionRef,String>{
    @Query(value = "SELECT * FROM lan_dbspt.tbl_kondisi_barang WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<AssetConditionRef> findItemConditionByIDCompany(String id_perusahaan);
}
