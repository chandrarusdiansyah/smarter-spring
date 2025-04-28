package com.sentinel.smarter.modules.presence.payloads.request;

public class PresenceRequest {
    private String id_perusahaan;
    private Long id_pegawai;
    private String tanggal;
    private Long id_jenis_presensi;
    private Long id_status_presensi;
    private String jam_masuk;
    private Double masuk_latitude;
    private Double masuk_longitude;
    private String masuk_foto;
    private String jam_keluar;
    private Double keluar_latitude;
    private Double keluar_longitude;
    private String keluar_foto;
    private Long id_pengguna;

    public PresenceRequest(
        String id_perusahaan, Long id_pegawai, String tanggal, Long id_jenis_presensi, Long id_status_presensi, String jam_masuk, Double masuk_latitude, Double masuk_longitude, String masuk_foto, String jam_keluar, Double keluar_latitude, Double keluar_longitude, String keluar_foto, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.id_pegawai = id_pegawai;
            this.tanggal = tanggal;
            this.id_jenis_presensi = id_jenis_presensi;
            this.id_status_presensi = id_status_presensi;
            this.jam_masuk = jam_masuk;
            this.masuk_latitude = masuk_latitude;
            this.masuk_longitude = masuk_longitude;
            this.masuk_foto = masuk_foto;
            this.jam_keluar = jam_keluar;
            this.keluar_latitude = keluar_latitude;
            this.keluar_longitude = keluar_longitude;
            this.keluar_foto = keluar_foto;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_pegawai() {
        return id_pegawai;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Long getID_jenis_presensi() {
        return id_jenis_presensi;
    }

    public void setID_jenis_presensi(Long id_jenis_presensi) {
        this.id_jenis_presensi = id_jenis_presensi;
    }

    public Long getID_status_presensi() {
        return id_status_presensi;
    }

    public void setID_status_presensi(Long id_status_presensi) {
        this.id_status_presensi = id_status_presensi;
    }

    public String getJam_masuk() {
        return jam_masuk;
    }

    public void setJam_masuk(String jam_masuk) {
        this.jam_masuk = jam_masuk;
    }
    
    public Double getMasuk_latitude() {
        return masuk_latitude;
    }

    public void setMasuk_latitude(Double masuk_latitude) {
        this.masuk_latitude = masuk_latitude;
    }

    public Double getMasuk_longitude() {
        return masuk_longitude;
    }

    public void setMasuk_longitude(Double masuk_longitude) {
        this.masuk_longitude = masuk_longitude;
    }

    public String getMasuk_foto() {
        return masuk_foto;
    }

    public void setMasuk_foto(String masuk_foto) {
        this.masuk_foto = masuk_foto;
    }

    public String getJam_keluar() {
        return jam_keluar;
    }

    public void setJam_keluar(String jam_keluar) {
        this.jam_keluar = jam_keluar;
    }
    
    public Double getKeluar_latitude() {
        return keluar_latitude;
    }

    public void setKeluar_latitude(Double keluar_latitude) {
        this.keluar_latitude = keluar_latitude;
    }

    public Double getKeluar_longitude() {
        return keluar_longitude;
    }

    public void setKeluar_longitude(Double keluar_longitude) {
        this.keluar_longitude = keluar_longitude;
    }

    public String getKeluar_foto() {
        return keluar_foto;
    }

    public void setKeluar_foto(String keluar_foto) {
        this.keluar_foto = keluar_foto;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
