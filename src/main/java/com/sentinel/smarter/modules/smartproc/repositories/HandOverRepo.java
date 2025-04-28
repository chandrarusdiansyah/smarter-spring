package com.sentinel.smarter.modules.smartproc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.HandOver;

@Repository
public interface HandOverRepo extends JpaRepository<HandOver,String> {
    @Query(value = "SELECT * FROM lan_dbspc.tbl_berita_acara WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<HandOver> findHandOverByIDCompany(String id_perusahaan);
    @Query(value = "SELECT * FROM lan_dbspc.tbl_berita_acara WHERE ID_PERUSAHAAN = ?1 AND ID_KONTRAK=?2;", nativeQuery = true)
    List<HandOver> findHandOverByIDContract(String id_perusahaan, String id_kontrak);
}
