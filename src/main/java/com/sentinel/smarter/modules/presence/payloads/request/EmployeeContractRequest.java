package com.sentinel.smarter.modules.presence.payloads.request;

public class EmployeeContractRequest {
    private String id_perusahaan;
    private Long id_satuan_kerja;
    private String nik;
    private String nama;
    private Long id_jenis_kelamin;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String alamat;
    private String seluler;
    private Long id_jenis_kerja;
    private String foto;
    private Long id_pengguna;

    public EmployeeContractRequest(
        String id_perusahaan, Long id_satuan_kerja, String nik, String nama, Long id_jenis_kelamin, String tempat_lahir, String tanggal_lahir, String alamat, String seluler, Long id_jenis_kerja, String foto, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.id_satuan_kerja = id_satuan_kerja;
            this.nik = nik;
            this.nama = nama;
            this.id_jenis_kelamin = id_jenis_kelamin;
            this.tempat_lahir = tempat_lahir;
            this.tanggal_lahir = tanggal_lahir;
            this.alamat = alamat;
            this.seluler = seluler;
            this.id_jenis_kerja = id_jenis_kerja;
            this.foto = foto;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_satuan_kerja() {
        return id_satuan_kerja;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.id_satuan_kerja = id_satuan_kerja;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getID_jenis_kelamin() {
        return id_jenis_kelamin;
    }

    public void setID_jenis_kelamin(Long id_jenis_kelamin) {
        this.id_jenis_kelamin = id_jenis_kelamin;
    }

    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getSeluler() {
        return seluler;
    }

    public void setSeluler(String seluler) {
        this.seluler = seluler;
    }

    public Long getID_jenis_kerja() {
        return id_jenis_kerja;
    }

    public void setID_jenis_kerja(Long id_jenis_kerja) {
        this.id_jenis_kerja = id_jenis_kerja;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

}
