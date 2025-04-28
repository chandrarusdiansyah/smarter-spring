package com.sentinel.smarter.modules.pelita.payloads.request;

public class GuestRequest {
    private String id_perusahaan;
    private Long id_jenis_tamu;
    private String nama;
    private String instansi;
    private String alamat;
    private String telepon;
    private String email;
    private String keterangan;
    private Long id_pengguna;

    public GuestRequest(
        String id_perusahaan, Long id_jenis_tamu, String nama, String instansi, String alamat, 
        String telepon, String email, String keterangan, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.id_jenis_tamu = id_jenis_tamu;
            this.nama = nama;
            this.instansi = instansi;
            this.alamat = alamat;
            this.telepon = telepon;
            this.email = email;
            this.keterangan = keterangan;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_jenis_tamu() {
        return id_jenis_tamu;
    }

    public void setID_jenis_tamu(Long id_jenis_tamu) {
        this.id_jenis_tamu = id_jenis_tamu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
