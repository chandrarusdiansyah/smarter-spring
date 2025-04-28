package com.sentinel.smarter.payloads.request;

public class UserRequest {
    private String id_perusahaan;
    private Long id_aplikasi;
    private Long id_jenis_pengguna;
    private Long id_pegawai;
    private String nama_pengguna;
    private String kata_sandi;
    private String ip_registrasi;
    private Long id_pengguna;

    public UserRequest(String id_perusahaan, Long id_aplikasi, Long id_jenis_pengguna, Long id_pegawai, String nama_pengguna, String kata_sandi, String ip_registrasi, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.id_aplikasi = id_aplikasi;
        this.id_jenis_pengguna = id_jenis_pengguna;
        this.id_pegawai = id_pegawai;
        this.nama_pengguna = nama_pengguna;
        this.kata_sandi = kata_sandi;
        this.ip_registrasi = ip_registrasi;
        this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_aplikasi() {
        return id_aplikasi;
    }

    public void setID_aplikasi(Long id_aplikasi) {
        this.id_aplikasi = id_aplikasi;
    }

    public Long getID_jenis_pengguna() {
        return id_jenis_pengguna;
    }

    public void setID_jenis_pengguna(Long id_jenis_pengguna) {
        this.id_jenis_pengguna = id_jenis_pengguna;
    }

    public Long getID_pegawai() {
        return id_pegawai;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getKata_sandi() {
        return kata_sandi;
    }

    public void setKata_sandi(String kata_sandi) {
        this.kata_sandi = kata_sandi;
    }

    public String getIp_registrasi() {
        return ip_registrasi;
    }

    public void setIp_registrasi(String ip_registrasi) {
        this.ip_registrasi = ip_registrasi;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
