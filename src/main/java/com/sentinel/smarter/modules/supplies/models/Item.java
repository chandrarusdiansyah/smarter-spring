package com.sentinel.smarter.modules.supplies.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_barang")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String KODE;
    private Long ID_JENIS_BARANG;
    private String NAMA;
    private Long ID_SATUAN;
    private Long HARGA;
    private Long JUMLAH;
    private String GAMBAR;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public Item() {
  
    }

    public Item(String ID_PERUSAHAAN, String KODE, Long ID_JENIS_BARANG, String NAMA, Long ID_SATUAN, Long HARGA, Long JUMLAH, String GAMBAR, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.KODE = KODE;
        this.ID_JENIS_BARANG = ID_JENIS_BARANG;
        this.NAMA = NAMA;
        this.ID_SATUAN = ID_SATUAN;
        this.HARGA = HARGA;
        this.JUMLAH = JUMLAH;
        this.GAMBAR = GAMBAR;
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

    public String getKode() {
        return KODE;
    }

    public void setKode(String kode) {
        this.KODE = kode;
    }

    public Long getID_jenis_barang() {
        return ID_JENIS_BARANG;
    }

    public void setID_jenis_barang(Long id_jenis_barang) {
        this.ID_JENIS_BARANG = id_jenis_barang;
    }

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }

    public Long getID_satuan() {
        return ID_SATUAN;
    }

    public void setID_satuan(Long id_satuan) {
        this.ID_SATUAN = id_satuan;
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

    public String getGambar() {
        return GAMBAR;
    }

    public void setGambar(String gambar) {
        this.GAMBAR = gambar;
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
