package com.sentinel.smarter.modules.smartproc.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.smartproc.models.view.ContractValueWorkPlaceView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface ContractValueWorkPlaceViewRepo extends ReadOnlyRepo<ContractValueWorkPlaceView,String> {
    @Query(value = "SELECT * FROM lan_dbspc.nilai_satuan_kerja WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<ContractValueWorkPlaceView> findContractValueWorkPlaceViewByIDCompany(String id_perusahaan);
}
