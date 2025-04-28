package com.sentinel.smarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.models.UserType;

import java.util.List;

@Repository
public interface UserTypeRepo extends JpaRepository<UserType, String>{
    @Query(value = "SELECT * FROM lan_dbsmt.tbl_jenis_pengguna WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<UserType> findUserTypeByIDCompany(String id_perusahaan);
}
