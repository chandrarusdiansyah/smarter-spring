package com.sentinel.smarter.modules.smartproc.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.reference.ContractMethodRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ContractMethodRefRepo extends ReadOnlyRepo<ContractMethodRef,String> {
    @Query(value = "SELECT * FROM lan_dbspc.tbl_metode_kontrak WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<ContractMethodRef> findContractMethodReferenceByIDCompany(String id_perusahaan);
}
