package com.sentinel.smarter.modules.presence.repositories.view;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.sentinel.smarter.modules.presence.models.view.PresenceView;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class PresenceViewRepo {
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<PresenceView> findPresenceByIDCompany(String id_perusahaan){
        Query q = em.createNativeQuery("SELECT * FROM lan_dbprc.presensi WHERE ID_PERUSAHAAN = " + id_perusahaan , PresenceView.class);
        List<PresenceView> presenceViews = q.getResultList();
        return presenceViews;
    }

    @SuppressWarnings("unchecked")
    public List<PresenceView> findPresenceByQuery(String sql){
        Query q = em.createNativeQuery(sql, PresenceView.class);
        List<PresenceView> presenceViews = q.getResultList();
        return presenceViews;
    }

    @SuppressWarnings("unchecked")
    public List<PresenceView> findPresenceByIDEmployeeContract(String id_pegawai_kontrak){
        Query q = em.createNativeQuery("SELECT ID, ID_PEGAWAI, NIK_PEGAWAI, NAMA_PEGAWAI, KODE_SATUAN_KERJA, NAMA_SATUAN_KERJA, LOKASI_SATUAN_KERJA, NAMA_JENIS_KERJA, TANGGAL, NAMA_JENIS_PRESENSI, NAMA_STATUS_PRESENSI, JAM_MASUK, MASUK_LATITUDE, MASUK_LONGITUDE, MASUK_FOTO, JAM_KELUAR, KELUAR_LATITUDE, KELUAR_LONGITUDE, KELUAR_FOTO FROM lan_dbprc.presensi WHERE ID_PEGAWAI = " + id_pegawai_kontrak + " ORDER BY TANGGAL DESC LIMIT 30", PresenceView.class);
        List<PresenceView> presenceViews = q.getResultList();
        return presenceViews;
    }

    @SuppressWarnings("unchecked")
    public List<PresenceView> findPresenceTodayByIDEmployeeContract(String id_pegawai_kontrak){
        Query q = em.createNativeQuery("SELECT ID, ID_PEGAWAI, NIK_PEGAWAI, NAMA_PEGAWAI, KODE_SATUAN_KERJA, NAMA_SATUAN_KERJA, LOKASI_SATUAN_KERJA, NAMA_JENIS_KERJA, TANGGAL, NAMA_JENIS_PRESENSI, NAMA_STATUS_PRESENSI, JAM_MASUK, MASUK_LATITUDE, MASUK_LONGITUDE, MASUK_FOTO, JAM_KELUAR, KELUAR_LATITUDE, KELUAR_LONGITUDE, KELUAR_FOTO FROM lan_dbprc.presensi WHERE ID_PEGAWAI = " + id_pegawai_kontrak + " AND TANGGAL=DATE(NOW())", PresenceView.class);
        List<PresenceView> presenceViews = q.getResultList();
        return presenceViews;
    }

}
