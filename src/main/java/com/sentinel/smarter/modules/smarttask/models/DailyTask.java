package com.sentinel.smarter.modules.smarttask.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_tugas_harian")
public class DailyTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String TANGGAL;
    private Long ID_TUGAS;
    private String KEGIATAN;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public DailyTask() {
  
    }

    public DailyTask(String ID_PERUSAHAAN, String TANGGAL, Long ID_TUGAS, String KEGIATAN, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.TANGGAL = TANGGAL;
        this.ID_TUGAS = ID_TUGAS;
        this.KEGIATAN = KEGIATAN;
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
    
    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }

    public Long getID_tugas() {
        return ID_TUGAS;
    }

    public void setID_tugas(Long id_tugas) {
        this.ID_TUGAS = id_tugas;
    }

    public String getKegiatan() {
        return KEGIATAN;
    }

    public void setKegiatan(String kegiatan) {
        this.KEGIATAN = kegiatan;
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
