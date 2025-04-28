package com.sentinel.smarter.models;

import jakarta.persistence.*; 

@Entity
@Table(name="tbl_pengguna")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_APLIKASI;
    private Long ID_JENIS_PENGGUNA;
    private Long ID_PEGAWAI;
    private String NAMA_PENGGUNA;
    private String KATA_SANDI;
    private String IP_REGISTRASI;
    private Long ID_PENGGUNA;

    public User(){

    }

    public User(String ID_PERUSAHAAN, Long ID_APLIKASI, Long ID_JENIS_PENGGUNA, Long ID_PEGAWAI, String NAMA_PENGGUNA, String KATA_SANDI, String IP_REGISTRASI, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_APLIKASI = ID_APLIKASI;
            this.ID_JENIS_PENGGUNA = ID_JENIS_PENGGUNA;
            this.ID_PEGAWAI = ID_PEGAWAI;
            this.NAMA_PENGGUNA = NAMA_PENGGUNA;
            this.KATA_SANDI = KATA_SANDI;
            this.IP_REGISTRASI = IP_REGISTRASI;
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

    public Long getID_aplikasi() {
        return ID_APLIKASI;
    }

    public void setID_aplikasi(Long id_aplikasi) {
        this.ID_APLIKASI = id_aplikasi;
    }

    public Long getID_jenis_pengguna() {
        return ID_JENIS_PENGGUNA;
    }

    public void setID_jenis_pengguna(Long id_jenis_pengguna) {
        this.ID_JENIS_PENGGUNA = id_jenis_pengguna;
    }

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.ID_PEGAWAI = id_pegawai;
    }

    public String getNama_pengguna() {
        return NAMA_PENGGUNA;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.NAMA_PENGGUNA = nama_pengguna;
    }

    public String getKata_sandi() {
        return KATA_SANDI;
    }

    public void setKata_sandi(String kata_sandi) {
        this.KATA_SANDI = kata_sandi;
    }

    public String getIp_registrasi() {
        return IP_REGISTRASI;
    }

    public void setIp_registrasi(String ip_registrasi) {
        this.IP_REGISTRASI = ip_registrasi;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
