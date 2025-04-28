package com.sentinel.smarter.modules.smartproc.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_rekanan")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String NAMA;
    private String ALAMAT;
    private String KONTAK;
    private String TELEPON;
    private String SELULER;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public Partner() {
  
    }

    public Partner(String ID_PERUSAHAAN, String NAMA, String ALAMAT, String KONTAK, String TELEPON, String SELULER, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.NAMA = NAMA;
        this.ALAMAT = ALAMAT;
        this.KONTAK = KONTAK;
        this.TELEPON = TELEPON;
        this.SELULER = SELULER;
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

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }     


    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String alamat) {
        this.ALAMAT = alamat;
    }        

    public String getKontak() {
        return KONTAK;
    }

    public void setKontak(String kontak) {
        this.KONTAK = kontak;
    }    

    public String getTelepon() {
        return TELEPON;
    }

    public void setTelepon(String telepon) {
        this.TELEPON = telepon;
    }   

    public String getSeluler() {
        return SELULER;
    }

    public void setSeluler(String seluler) {
        this.SELULER = seluler;
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
