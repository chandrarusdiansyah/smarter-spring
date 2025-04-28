package com.sentinel.smarter.repositories.view;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.view.EmployeeView;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface EmployeeViewRepo extends ReadOnlyRepo<EmployeeView, String> {
    @Query(value = "SELECT * FROM lan_dbsmt.pegawai WHERE ID_PERUSAHAAN = ?1;", nativeQuery = true)
    List<EmployeeView> findEmployeeViewByIDCompany(String id_perusahaan);
}
