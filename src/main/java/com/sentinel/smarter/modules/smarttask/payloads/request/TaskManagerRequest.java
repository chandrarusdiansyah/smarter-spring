package com.sentinel.smarter.modules.smarttask.payloads.request;

public class TaskManagerRequest {
    private String id_perusahaan;
    private Long id_proyek;
    private String tugas;
    private Long id_pegawai;
    private Long id_tugas_prioritas;
    private String tgl_mulai;
    private String tgl_selesai;
    private Long id_tugas_status;
    private String keterangan;
    private Long id_pengguna;

    public TaskManagerRequest(String id_perusahaan, Long id_proyek, String tugas, Long id_pegawai, Long id_tugas_prioritas, String tgl_mulai, String tgl_selesai, Long id_tugas_status, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.id_proyek = id_proyek;
        this.tugas = tugas;
        this.id_pegawai = id_pegawai;
        this.id_tugas_prioritas = id_tugas_prioritas;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        this.id_tugas_status = id_tugas_status;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_proyek() {
        return id_proyek;
    }

    public void setID_proyek(Long id_proyek) {
        this.id_proyek = id_proyek;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public Long getID_pegawai() {
        return id_pegawai;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public Long getID_tugas_prioritas() {
        return id_tugas_prioritas;
    }

    public void setID_tugas_prioritas(Long id_tugas_prioritas) {
        this.id_tugas_prioritas = id_tugas_prioritas;
    }

    public String getTgl_mulai() {
        return tgl_mulai;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public String getTgl_selesai() {
        return tgl_selesai;
    }

    public void setTgl_selesai(String tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public Long getID_tugas_status() {
        return id_tugas_status;
    }

    public void setID_ptugas_status(Long id_tugas_status) {
        this.id_tugas_status = id_tugas_status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
