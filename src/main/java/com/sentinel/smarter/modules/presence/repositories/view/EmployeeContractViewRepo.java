package com.sentinel.smarter.modules.presence.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.view.EmployeeContractView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface EmployeeContractViewRepo extends ReadOnlyRepo<EmployeeContractView,String> {
    @Query(value = "SELECT * FROM lan_dbprc.pegawai WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<EmployeeContractView> findEmployeeContractViewByIDCompany(String id_perusahaan);

    @Query(value = "SELECT * FROM lan_dbprc.pegawai WHERE ID_SATUAN_KERJA = ?1;", nativeQuery = true)
    List<EmployeeContractView> findEmployeeContractViewByIDWorkPlace(String id_satuan_kerja);

    @Query(value = "SELECT * FROM lan_dbprc.pegawai WHERE NIK = ?1;", nativeQuery = true)
    List<EmployeeContractView> findEmployeeContractViewByCardID(String nik);

    @Query(value = "SELECT * FROM lan_dbprc.pegawai WHERE ID = ?1;", nativeQuery = true)
    List<EmployeeContractView> findEmployeeContractViewByID(String id);
}
