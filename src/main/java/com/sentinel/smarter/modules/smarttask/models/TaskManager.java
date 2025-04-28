package com.sentinel.smarter.modules.smarttask.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_tugas")
public class TaskManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_PROYEK;
    private String TUGAS;
    private Long ID_PEGAWAI;
    private Long ID_TUGAS_PRIORITAS;
    private String TGL_MULAI;
    private String TGL_SELESAI;
    private Long ID_TUGAS_STATUS;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public TaskManager() {
  
    }

    public TaskManager(String ID_PERUSAHAAN, Long ID_PROYEK, String TUGAS, Long ID_PEGAWAI, Long ID_TUGAS_PRIORITAS, String TGL_MULAI, String TGL_SELESAI, Long ID_TUGAS_STATUS, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_PROYEK = ID_PROYEK;
        this.TUGAS = TUGAS;
        this.ID_PEGAWAI = ID_PEGAWAI;
        this.ID_TUGAS_PRIORITAS = ID_TUGAS_PRIORITAS;
        this.TGL_MULAI = TGL_MULAI;
        this.TGL_SELESAI = TGL_SELESAI;
        this.ID_TUGAS_STATUS = ID_TUGAS_STATUS;
        this.KETERANGAN = KETERANGAN;
        this.ID_PENGGUNA = ID_PENGGUNA;
    } 

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getID_perusahaan() {
        return ID_PERUSAHAAN;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.ID_PERUSAHAAN = id_perusahaan;
    }

    public Long getID_proyek() {
        return ID_PROYEK;
    }

    public void setID_proyek(Long id_proyek) {
        this.ID_PROYEK = id_proyek;
    }

    public String getTugas() {
        return TUGAS;
    }

    public void setTugas(String tugas) {
        this.TUGAS = tugas;
    }

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.ID_PEGAWAI = id_pegawai;
    }

    public Long getID_tugas_prioritas() {
        return ID_TUGAS_PRIORITAS;
    }

    public void setID_tugas_prioritas(Long id_tugas_prioritas) {
        this.ID_TUGAS_PRIORITAS = id_tugas_prioritas;
    }

    public String getTgl_mulai() {
        return TGL_MULAI;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.TGL_MULAI = tgl_mulai;
    }

    public String getTgl_selesai() {
        return TGL_SELESAI;
    }

    public void setTgl_selesai(String tgl_selesai) {
        this.TGL_SELESAI = tgl_selesai;
    }

    public Long getID_tugas_status() {
        return ID_TUGAS_STATUS;
    }

    public void setID_tugas_status(Long id_tugas_status) {
        this.ID_TUGAS_STATUS = id_tugas_status;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }

    public void setKeterangan(String keterangan) {
        this.KETERANGAN = keterangan;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
