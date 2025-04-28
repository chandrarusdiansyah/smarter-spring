package com.sentinel.smarter.modules.pelita.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_sarana")
public class Means {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_SATUAN_KERJA;
    private Long ID_JENIS_BARANG;
    private Long ID_ALOKASI;
    private String KODE;
    private String NAMA;
    private String KETERANGAN;
    private Long ID_KONDISI;
    private String INTERNAL;
    private String SEWA;
    private String RAWAT;
    private String FOTO;
    private Long ID_PENGGUNA;

    public Means() {
  
    }

    public Means(
        String ID_PERUSAHAAN, Long ID_SATUAN_KERJA, Long ID_JENIS_BARANG, Long ID_ALOKASI,
        String KODE, String NAMA, String KETERANGAN, Long ID_KONDISI, String INTERNAL, 
        String RAWAT, String SEWA, String FOTO, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_SATUAN_KERJA = ID_SATUAN_KERJA;
            this.ID_JENIS_BARANG = ID_JENIS_BARANG;
            this.ID_ALOKASI = ID_ALOKASI;
            this.KODE = KODE;
            this.NAMA = NAMA;
            this.KETERANGAN = KETERANGAN;
            this.ID_KONDISI = ID_KONDISI;
            this.INTERNAL = INTERNAL;
            this.SEWA = SEWA;
            this.RAWAT = RAWAT;
            this.FOTO = FOTO;
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

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public Long getID_jenis_barang() {
        return ID_JENIS_BARANG;
    }

    public void setID_jenis_barang(Long id_jenis_barang) {
        this.ID_JENIS_BARANG = id_jenis_barang;
    }

    public Long getID_alokasi() {
        return ID_ALOKASI;
    }

    public void setID_alokasi(Long id_alokasi) {
        this.ID_ALOKASI = id_alokasi;
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

    public void seKeterangan(String keterangan) {
        this.KETERANGAN = keterangan;
    }

    public Long getID_kondisi() {
        return ID_KONDISI;
    }

    public void setID_kondisi(Long id_kondisi) {
        this.ID_KONDISI = id_kondisi;
    }

    public String getInternal() {
        return INTERNAL;
    }

    public void setInternal(String internal) {
        this.INTERNAL = internal;
    }

    public String getSewa() {
        return SEWA;
    }

    public void setSewa(String sewa) {
        this.SEWA = sewa;
    }

    public String getRawat() {
        return RAWAT;
    }

    public void setRawat(String rawat) {
        this.RAWAT = rawat;
    }

    public String getFoto() {
        return FOTO;
    }

    public void setFoto(String foto) {
        this.FOTO = foto;
    }
    
    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
