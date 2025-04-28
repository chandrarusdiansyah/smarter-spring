package com.sentinel.smarter.modules.supplies.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_transaksi")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_JENIS_TRANSAKSI;
    private String TANGGAL;
    private String NOMOR;
    private Long ID_PEGAWAI;
    private String KETERANGAN;
    private String TGL_UPDATE;
    private Long ID_PENGGUNA;
    
    public Transaction() {
  
    }

    public Transaction(String ID_PERUSAHAAN, Long ID_JENIS_TRANSAKSI, String TANGGAL, String NOMOR, Long ID_PEGAWAI, String KETERANGAN, Long ID_PENGGUNA, String TGL_UPDATE) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_JENIS_TRANSAKSI = ID_JENIS_TRANSAKSI;
        this.TANGGAL = TANGGAL;
        this.NOMOR = NOMOR;
        this.ID_PEGAWAI = ID_PEGAWAI;
        this.KETERANGAN = KETERANGAN;
        this.ID_PENGGUNA = ID_PENGGUNA;
        this.TGL_UPDATE = TGL_UPDATE;
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

    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }

    public String getNomor() {
        return NOMOR;
    }

    public void setNomor(String nomor) {
        this.NOMOR = nomor;
    }

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public void setID_pegawai(Long id_pegawai) {
        this.ID_PEGAWAI = id_pegawai;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }

    public void setKeterangan(String keterangan) {
        this.KETERANGAN = keterangan;
    }

    public String getTgl_update() {
        return TGL_UPDATE;
    }

    public void setTgl_update(String tgl_update) {
        this.TGL_UPDATE = tgl_update;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
