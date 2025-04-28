package com.sentinel.smarter.modules.smartproc.payloads.request;

public class HandOverRequest {
    private String id_perusahaan;
    private Long id_kontrak;
    private String nomor;
    private String tanggal;
    private String deskripsi;
    private Long id_pengguna;

    public HandOverRequest(String id_perusahaan, Long id_kontrak, String nomor, String tanggal, String deskripsi, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.id_kontrak = id_kontrak;
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.deskripsi = deskripsi;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_kontrak() {
        return id_kontrak;
    }

    public void setID_kontrak(Long id_kontrak) {
        this.id_kontrak = id_kontrak;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }  

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }   

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
