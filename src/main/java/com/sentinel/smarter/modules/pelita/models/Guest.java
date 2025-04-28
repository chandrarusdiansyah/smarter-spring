package com.sentinel.smarter.modules.pelita.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_tamu")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_JENIS_TAMU;
    private String NAMA;
    private String INSTANSI;
    private String ALAMAT;
    private String TELEPON;
    private String EMAIL;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public Guest() {
  
    }

    public Guest(
        String ID_PERUSAHAAN, Long ID_JENIS_TAMU, String NAMA, String INSTANSI, String ALAMAT, 
        String TELEPON, String EMAIL, String KETERANGAN, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_JENIS_TAMU = ID_JENIS_TAMU;
            this.NAMA = NAMA;
            this.INSTANSI = INSTANSI;
            this.ALAMAT = ALAMAT;
            this.TELEPON = TELEPON;
            this.EMAIL = EMAIL;
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

    public Long getID_jenis_tamu() {
        return ID_JENIS_TAMU;
    }

    public void setID_jenis_tamu(Long id_jenis_tamu) {
        this.ID_JENIS_TAMU = id_jenis_tamu;
    }

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }

    public String getInstansi() {
        return INSTANSI;
    }

    public void setInstansi(String instansi) {
        this.INSTANSI = instansi;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String alamat) {
        this.ALAMAT = alamat;
    }

    public String getTelepon() {
        return TELEPON;
    }

    public void setTelepon(String telepon) {
        this.TELEPON = telepon;
    }

    public String getEmail() {
        return EMAIL;
    }

    public void setEmail(String email) {
        this.EMAIL = email;
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
