package com.sentinel.smarter.modules.supplies.payloads.request;

public class TransactionDetailRequest {
    private String id_perusahaan;
    private Long id_jenis_transaksi;
    private Long id_transaksi;
    private Long id_barang;
    private Long harga;
    private Long jumlah;
    private String keterangan;
    private Long id_pengguna;

    public TransactionDetailRequest(String id_perusahaan, Long id_jenis_transaksi, Long id_transaksi, Long id_barang, Long harga, Long jumlah, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.id_jenis_transaksi = id_jenis_transaksi;
        this.id_transaksi = id_transaksi;
        this.id_barang = id_barang;
        this.harga = harga;
        this.jumlah = jumlah;
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

    public Long getID_transaksi() {
        return id_transaksi;
    }

    public void setID_transaksi(Long id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Long getID_barang() {
        return id_barang;
    }

    public void setID_barang(Long id_barang) {
        this.id_barang = id_barang;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Long getJumlah() {
        return jumlah;
    }

    public void setJumlah(Long jumlah) {
        this.jumlah = jumlah;
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
