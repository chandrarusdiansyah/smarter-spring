package com.sentinel.smarter.modules.smartproc.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.view.ContractView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ContractViewRepo extends ReadOnlyRepo<ContractView,String> {
    @Query(value = "SELECT * FROM lan_dbspc.kontrak WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<ContractView> findContractByIDCompany(String id_perusahaan);
    @Query(value = "SELECT * FROM lan_dbspc.kontrak WHERE ID_PERUSAHAAN = ?1 AND ID_JENIS_KONTRAK=?2;", nativeQuery = true)
    List<ContractView> findContractByIDContractType(String id_perusahaan, String id_jenis_kontrak);
    @Query(value = "SELECT * FROM lan_dbspc.kontrak WHERE ID_PERUSAHAAN = ?1 AND SELESAI='N';", nativeQuery = true)
    List<ContractView> findContractNotFinished(String id_perusahaan);
}
