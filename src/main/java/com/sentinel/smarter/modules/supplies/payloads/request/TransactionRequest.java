package com.sentinel.smarter.modules.supplies.payloads.request;

public class TransactionRequest {
    private String id_perusahaan;
    private Long id_jenis_transaksi;
    private String tanggal;
    private String nomor;
    private Long id_pegawai;
    private String keterangan;
    private Long id_pengguna;

    public TransactionRequest(String id_perusahaan, Long id_jenis_transaksi, String tanggal, String nomor, Long id_pegawai, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.id_jenis_transaksi = id_jenis_transaksi;
        this.tanggal = tanggal;
        this.nomor = nomor;
        this.id_pegawai = id_pegawai;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_jenis_transaksi() {
        return id_jenis_transaksi;
    }

    public void setID_jenis_transaksi(Long id_jenis_transaksi) {
        this.id_jenis_transaksi = id_jenis_transaksi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Long getID_pegawai() {
        return id_pegawai;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.id_pegawai = id_pegawai;
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
