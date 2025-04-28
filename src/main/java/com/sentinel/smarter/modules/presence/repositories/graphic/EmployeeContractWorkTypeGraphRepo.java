package com.sentinel.smarter.modules.presence.repositories.graphic;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.graphic.EmployeeContractWorkTypeGraph;
import com.sentinel.smarter.repositories.ReadOnlyRepo;

@Repository
public interface EmployeeContractWorkTypeGraphRepo extends ReadOnlyRepo<EmployeeContractWorkTypeGraph,String> {
    @Query(value = "SELECT a.NAMA_JENIS_KERJA, a.WARNA_JENIS_KERJA, COUNT(*) AS JUMLAH, ROUND((COUNT(*)/((SELECT COUNT(*) FROM lan_dbprc.pegawai x WHERE x.ID_PERUSAHAAN=a.ID_PERUSAHAAN)/100)),2) AS PERSEN FROM lan_dbprc.pegawai a WHERE a.ID_PERUSAHAAN = ?1 GROUP BY a.ID_JENIS_KERJA", nativeQuery = true)
    List<EmployeeContractWorkTypeGraph> findEmployeeContractWorkTypeGraphicByIDCompany(String id_perusahaan);
}
