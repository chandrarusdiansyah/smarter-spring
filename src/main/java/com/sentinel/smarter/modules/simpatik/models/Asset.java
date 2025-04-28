package com.sentinel.smarter.modules.simpatik.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_barang")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_JENIS_BARANG;
    private String KODE;
    private String NAMA;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public Asset() {
  
    }

    public Asset(String ID_PERUSAHAAN, Long ID_JENIS_BARANG, String KODE, String NAMA, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.ID_JENIS_BARANG = ID_JENIS_BARANG;
        this.KODE = KODE;
        this.NAMA = NAMA;
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

    public Long getID_jenis_barang() {
        return ID_JENIS_BARANG;
    }

    public void setID_jenis_barang(Long id_jenis_barang) {
        this.ID_JENIS_BARANG = id_jenis_barang;
    }

    public String getKode() {
        return KODE;
    }

    public void setKode(String kode) {
        this.KODE = kode;
    }

    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
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
