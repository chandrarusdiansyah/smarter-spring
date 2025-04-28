package com.sentinel.smarter.payloads.request;

public class WorkUnitRequest {
    private String id_perusahaan;
    private String kode;
    private String nama;
    private String keterangan;
    private Long id_pengguna;

    public WorkUnitRequest(String id_perusahaan, String kode, String nama, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.kode = kode;
        this.nama = nama;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
