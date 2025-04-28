package com.sentinel.smarter.modules.pelita.payloads.request;

public class OrderRequest {
    private String id_perusahaan;
    private String tanggal;
    private Long id_satuan_kerja;
    private Long id_tamu;
    private String tgl_masuk;
    private String tgl_keluar;
    private String kegiatan;
    private Long peserta;
    private String keterangan;
    private Long id_pengguna;

    public OrderRequest(
        String id_perusahaan, String tanggal, Long id_satuan_kerja, Long id_tamu, String tgl_masuk, String tgl_keluar, 
        String kegiatan, Long peserta, String keterangan, String periksa, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.tanggal = tanggal;
            this.id_satuan_kerja = id_satuan_kerja;
            this.id_tamu = id_tamu;
            this.tgl_masuk = tgl_masuk;
            this.tgl_keluar = tgl_keluar;
            this.kegiatan = kegiatan;
            this.peserta = peserta;
            this.keterangan = keterangan;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Long getID_satuan_kerja() {
        return id_satuan_kerja;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.id_satuan_kerja = id_satuan_kerja;
    }

    public Long getID_tamu() {
        return id_tamu;
    }

    public void setID_tamu(Long id_tamu) {
        this.id_tamu = id_tamu;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public Long getPeserta() {
        return peserta;
    }

    public void setPeserta(Long peserta) {
        this.peserta = peserta;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
