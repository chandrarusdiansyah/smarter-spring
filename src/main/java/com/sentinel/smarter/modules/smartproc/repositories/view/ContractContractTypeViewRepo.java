package com.sentinel.smarter.modules.smartproc.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.view.ContractContractTypeView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ContractContractTypeViewRepo extends ReadOnlyRepo<ContractContractTypeView,String> {
    @Query(value = "SELECT * FROM lan_dbspc.kontrak_jenis_kontrak WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ContractContractTypeView> findContractContractTypeViewByIDCompany(String id_perusahaan);
}
