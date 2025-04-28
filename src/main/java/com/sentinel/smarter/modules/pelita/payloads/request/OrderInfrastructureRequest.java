package com.sentinel.smarter.modules.pelita.payloads.request;

public class OrderInfrastructureRequest {
    private String id_perusahaan;
    private Long id_pesan;
    private Long id_prasarana;
    private String tanggal;
    private String dari_jam;
    private String sampai_jam;
    private Long id_pengguna;

    
    public OrderInfrastructureRequest(
        String id_perusahaan, Long id_pesan, Long id_prasarana, String tanggal, String dari_jam, String sampai_jam, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.id_pesan = id_pesan;
            this.id_prasarana = id_prasarana;
            this.tanggal = tanggal;
            this.dari_jam = dari_jam;
            this.sampai_jam = sampai_jam;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_pesan() {
        return id_pesan;
    }

    public void setID_pesan(Long id_pesan) {
        this.id_pesan = id_pesan;
    }

    public Long getID_prasarana() {
        return id_prasarana;
    }

    public void setID_prasarana(Long id_prasarana) {
        this.id_prasarana = id_prasarana;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getDari_jam() {
        return dari_jam;
    }

    public void setDari_jam(String dari_jam) {
        this.dari_jam = dari_jam;
    }

    public String getSampai_jam() {
        return sampai_jam;
    }

    public void setSampai_jam(String sampai_jam) {
        this.sampai_jam = sampai_jam;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
