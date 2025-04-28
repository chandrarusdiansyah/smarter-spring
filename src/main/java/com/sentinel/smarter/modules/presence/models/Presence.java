package com.sentinel.smarter.modules.presence.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_presensi")
public class Presence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_PEGAWAI;
    private String TANGGAL;
    private Long ID_JENIS_PRESENSI;
    private Long ID_STATUS_PRESENSI;
    private String JAM_MASUK;
    private Double MASUK_LATITUDE;
    private Double MASUK_LONGITUDE;
    private String MASUK_FOTO;
    private String JAM_KELUAR;
    private Double KELUAR_LATITUDE;
    private Double KELUAR_LONGITUDE;
    private String KELUAR_FOTO;
    private Long ID_PENGGUNA;

    public Presence() {
  
    }

    public Presence(
        String ID_PERUSAHAAN, Long ID_PEGAWAI, String TANGGAL, Long ID_JENIS_PRESENSI, Long ID_STATUS_PRESENSI, String JAM_MASUK, Double MASUK_LATITUDE, Double MASUK_LONGITUDE, String MASUK_FOTO, String JAM_KELUAR, Double KELUAR_LATITUDE, Double KELUAR_LONGITUDE, String KELUAR_FOTO, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_PEGAWAI = ID_PEGAWAI;
            this.TANGGAL = TANGGAL;
            this.ID_JENIS_PRESENSI = ID_JENIS_PRESENSI;
            this.ID_STATUS_PRESENSI = ID_STATUS_PRESENSI;
            this.JAM_MASUK = JAM_MASUK;
            this.MASUK_LATITUDE = MASUK_LATITUDE;
            this.MASUK_LONGITUDE = MASUK_LONGITUDE;
            this.MASUK_FOTO = MASUK_FOTO;
            this.JAM_KELUAR = JAM_KELUAR;
            this.KELUAR_LATITUDE = KELUAR_LATITUDE;
            this.KELUAR_LONGITUDE = KELUAR_LONGITUDE;
            this.KELUAR_FOTO = KELUAR_FOTO;
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

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.ID_PEGAWAI = id_pegawai;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }

    public Long getID_jenis_presensi() {
        return ID_JENIS_PRESENSI;
    }

    public void setID_jenis_presensi(Long id_jenis_presensi) {
        this.ID_JENIS_PRESENSI = id_jenis_presensi;
    }

    public Long getID_status_presensi() {
        return ID_STATUS_PRESENSI;
    }

    public void setID_status_presensi(Long id_status_presensi) {
        this.ID_STATUS_PRESENSI = id_status_presensi;
    }

    public String getJam_masuk() {
        return JAM_MASUK;
    }

    public void setJam_masuk(String jam_masuk) {
        this.JAM_MASUK = jam_masuk;
    }
    
    public Double getMasuk_latitude() {
        return MASUK_LATITUDE;
    }

    public void setMasuk_latitude(Double masuk_latitude) {
        this.MASUK_LATITUDE = masuk_latitude;
    }

    public Double getMasuk_longitude() {
        return MASUK_LONGITUDE;
    }

    public void setMasuk_longitude(Double masuk_longitude) {
        this.MASUK_LONGITUDE = masuk_longitude;
    }

    public String getMasuk_foto() {
        return MASUK_FOTO;
    }

    public void setMasuk_foto(String masuk_foto) {
        this.MASUK_FOTO = masuk_foto;
    }

    public String getJam_keluar() {
        return JAM_KELUAR;
    }

    public void setJam_keluar(String jam_keluar) {
        this.JAM_KELUAR = jam_keluar;
    }
    
    public Double getKeluar_latitude() {
        return KELUAR_LATITUDE;
    }

    public void setKeluar_latitude(Double keluar_latitude) {
        this.KELUAR_LATITUDE = keluar_latitude;
    }

    public Double getKeluar_longitude() {
        return KELUAR_LONGITUDE;
    }

    public void setKeluar_longitude(Double keluar_longitude) {
        this.KELUAR_LONGITUDE = keluar_longitude;
    }

    public String getKeluar_foto() {
        return KELUAR_FOTO;
    }

    public void setKeluar_foto(String keluar_foto) {
        this.KELUAR_FOTO = keluar_foto;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }

}
