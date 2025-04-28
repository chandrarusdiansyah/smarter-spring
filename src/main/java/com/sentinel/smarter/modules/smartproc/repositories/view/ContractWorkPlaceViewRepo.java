package com.sentinel.smarter.modules.smartproc.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.view.ContractWorkPlaceView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ContractWorkPlaceViewRepo extends ReadOnlyRepo<ContractWorkPlaceView,String> {
    @Query(value = "SELECT * FROM lan_dbspc.kontrak_satuan_kerja WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ContractWorkPlaceView> findContractWorkPlaceViewByIDCompany(String id_perusahaan);
}
