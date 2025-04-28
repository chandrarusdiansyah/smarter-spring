package com.sentinel.smarter.modules.smarttask.payloads.request;

public class DailyTaskRequest {
    private String id_perusahaan;
    private String tanggal;
    private Long id_tugas;
    private String kegiatan;
    private String keterangan;
    private Long id_pengguna;

    public DailyTaskRequest(String id_perusahaan, String tanggal, Long id_tugas, String kegiatan, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.tanggal = tanggal;
        this.id_tugas = id_tugas;
        this.kegiatan = kegiatan;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Long getID_tugas() {
        return id_tugas;
    }

    public void setID_tugas(Long id_tugas) {
        this.id_tugas = id_tugas;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void seKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void seKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
