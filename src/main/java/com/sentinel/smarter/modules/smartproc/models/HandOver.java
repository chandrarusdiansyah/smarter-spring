package com.sentinel.smarter.modules.smartproc.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_berita_acara")
public class HandOver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_KONTRAK;
    private String NOMOR;
    private String TANGGAL;
    private String DESKRIPSI;
    private Long ID_PENGGUNA;

    public HandOver() {
  
    }

    public HandOver(String ID_PERUSAHAAN, Long ID_KONTRAK, String NOMOR, String TANGGAL, String DESKRIPSI, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_KONTRAK = ID_KONTRAK;
        this.NOMOR = NOMOR;
        this.TANGGAL = TANGGAL;
        this.DESKRIPSI = DESKRIPSI;
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

    public Long getID_kontrak() {
        return ID_KONTRAK;
    }

    public void setID_kontrak(Long id_kontrak) {
        this.ID_KONTRAK = id_kontrak;
    }

    public String getNomor() {
        return NOMOR;
    }

    public void setNomor(String nomor) {
        this.NOMOR = nomor;
    }  

    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }   

    public String getDeskripsi() {
        return DESKRIPSI;
    }

    public void setDeskripsi(String deskripsi) {
        this.DESKRIPSI = deskripsi;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
