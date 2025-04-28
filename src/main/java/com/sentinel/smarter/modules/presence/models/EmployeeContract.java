package com.sentinel.smarter.modules.presence.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_pegawai")
public class EmployeeContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_SATUAN_KERJA;
    private String NIK;
    private String NAMA;
    private Long ID_JENIS_KELAMIN;
    private String TEMPAT_LAHIR;
    private String TANGGAL_LAHIR;
    private String ALAMAT;
    private String SELULER;
    private Long ID_JENIS_KERJA;
    private String FOTO;
    private Long ID_PENGGUNA;

    public EmployeeContract() {
  
    }

    public EmployeeContract(
        String ID_PERUSAHAAN, Long ID_SATUAN_KERJA, String NIK, String NAMA, Long ID_JENIS_KELAMIN, String TEMPAT_LAHIR, String TANGGAL_LAHIR, String ALAMAT, String SELULER, Long ID_JENIS_KERJA, String FOTO, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_SATUAN_KERJA = ID_SATUAN_KERJA;
            this.NIK = NIK;
            this.NAMA = NAMA;
            this.ID_JENIS_KELAMIN = ID_JENIS_KELAMIN;
            this.TEMPAT_LAHIR = TEMPAT_LAHIR;
            this.TANGGAL_LAHIR = TANGGAL_LAHIR;
            this.ALAMAT = ALAMAT;
            this.SELULER = SELULER;
            this.ID_JENIS_KERJA = ID_JENIS_KERJA;
            this.FOTO = FOTO;
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

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public String getNik() {
        return NIK;
    }

    public void setNik(String nik) {
        this.NIK = nik;
    }

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }

    public Long getID_jenis_kelamin() {
        return ID_JENIS_KELAMIN;
    }

    public void setID_jenis_kelamin(Long id_jenis_kelamin) {
        this.ID_JENIS_KELAMIN = id_jenis_kelamin;
    }

    public String getTempat_lahir() {
        return TEMPAT_LAHIR;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.TEMPAT_LAHIR = tempat_lahir;
    }

    public String getTanggal_lahir() {
        return TANGGAL_LAHIR;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.TANGGAL_LAHIR = tanggal_lahir;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String alamat) {
        this.ALAMAT = alamat;
    }

    public String getSeluler() {
        return SELULER;
    }

    public void setSeluler(String seluler) {
        this.SELULER = seluler;
    }

    public Long getID_jenis_kerja() {
        return ID_JENIS_KERJA;
    }

    public void setID_jenis_kerja(Long id_jenis_kerja) {
        this.ID_JENIS_KERJA = id_jenis_kerja;
    }

    public String getFoto() {
        return FOTO;
    }

    public void setFoto(String foto) {
        this.FOTO = foto;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }

}
