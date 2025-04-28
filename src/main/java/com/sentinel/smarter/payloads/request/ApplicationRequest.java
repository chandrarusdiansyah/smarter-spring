package com.sentinel.smarter.payloads.request;

public class ApplicationRequest {
    private String id_perusahaan;
    private String kode;
    private String nama;
    private String keterangan;
    private String logo;
    private String tautan;
    private Long id_pengguna;

    public ApplicationRequest(String id_perusahaan, String kode, String nama, String keterangan, String logo, String tautan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.kode = kode;
        this.nama = nama;
        this.keterangan = keterangan;
        this.logo = logo;
        this.tautan = tautan;
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

    public String getKeterangan() {
        return keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getLogo() {
        return logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTautan() {
        return tautan;
    }
    
    public void setTautan(String tautan) {
        this.tautan = tautan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }
    
    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
