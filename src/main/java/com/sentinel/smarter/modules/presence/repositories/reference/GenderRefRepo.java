package com.sentinel.smarter.modules.presence.repositories.reference;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.reference.GenderRef;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface GenderRefRepo extends ReadOnlyRepo<GenderRef,String>  {
    @Query(value = "SELECT * FROM lan_dbprc.tbl_jenis_kelamin WHERE ID_PERUSAHAAN = ?1", nativeQuery = true)
    List<GenderRef> findGenderByIDCompany(String id_perusahaan);
}
