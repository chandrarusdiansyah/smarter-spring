package com.sentinel.smarter.payloads.request;

public class WorkPlaceRequest {
    private String id_perusahaan;
    private String kode;
    private String nama;
    private String lokasi;
    private String keterangan;
    private Double latitude;
    private Double longitude;
    private Long id_pengguna;

    public WorkPlaceRequest(String id_perusahaan, String kode, String nama, String lokasi, String keterangan, Double latitude, Double longitude, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.kode = kode;
        this.nama = nama;
        this.lokasi = lokasi;
        this.keterangan = keterangan;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void seKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
