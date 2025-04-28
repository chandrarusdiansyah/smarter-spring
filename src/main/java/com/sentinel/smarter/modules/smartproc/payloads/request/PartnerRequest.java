package com.sentinel.smarter.modules.smartproc.payloads.request;

public class PartnerRequest {
    private String id_perusahaan;
    private String nama;
    private String alamat;
    private String kontak;
    private String telepon;
    private String seluler;
    private String keterangan;
    private Long id_pengguna;

    public PartnerRequest(String id_perusahaan, String nama, String alamat, String kontak, String telepon, String seluler, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.telepon = telepon;
        this.seluler = seluler;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }     

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }        

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }    

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }   

    public String getSeluler() {
        return seluler;
    }

    public void setSeluler(String seluler) {
        this.seluler = seluler;
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
