package com.sentinel.smarter.modules.supplies.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_transaksi_detail")
public class TransactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_JENIS_TRANSAKSI;
    private Long ID_TRANSAKSI;
    private Long ID_BARANG;
    private Long HARGA;
    private Long JUMLAH;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public TransactionDetail() {
  
    }

    public TransactionDetail(String ID_PERUSAHAAN, Long ID_JENIS_TRANSAKSI, Long ID_TRANSAKSI, Long ID_BARANG, Long HARGA, Long JUMLAH, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_JENIS_TRANSAKSI = ID_JENIS_TRANSAKSI;
        this.ID_TRANSAKSI = ID_TRANSAKSI;
        this.ID_BARANG = ID_BARANG;
        this.HARGA = HARGA;
        this.JUMLAH = JUMLAH;
        this.KETERANGAN = KETERANGAN;
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

    public Long getID_jenis_transaksi() {
        return ID_JENIS_TRANSAKSI;
    }

    public void setID_jenis_transaksi(Long id_jenis_transaksi) {
        this.ID_JENIS_TRANSAKSI = id_jenis_transaksi;
    }

    public Long getID_transaksi() {
        return ID_TRANSAKSI;
    }

    public void setID_transaksi(Long id_transaksi) {
        this.ID_TRANSAKSI = id_transaksi;
    }

    public Long getID_barang() {
        return ID_BARANG;
    }

    public void setID_barang(Long id_barang) {
        this.ID_BARANG = id_barang;
    }

    public Long getHarga() {
        return HARGA;
    }

    public void setHarga(Long harga) {
        this.HARGA = harga;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public void setJumlah(Long jumlah) {
        this.JUMLAH = jumlah;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }

    public void setKeterangan(String keterangan) {
        this.KETERANGAN = keterangan;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
