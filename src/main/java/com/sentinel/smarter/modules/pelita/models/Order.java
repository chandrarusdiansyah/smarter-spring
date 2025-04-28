package com.sentinel.smarter.modules.pelita.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_pesan")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String TANGGAL;
    private Long ID_SATUAN_KERJA;
    private Long ID_TAMU;
    private String TGL_MASUK;
    private String TGL_KELUAR;
    private String KEGIATAN;
    private Long PESERTA;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public Order() {
  
    }

    public Order(
        String ID_PERUSAHAAN, String TANGGAL, Long ID_SATUAN_KERJA, Long ID_TAMU, String TGL_MASUK, String TGL_KELUAR, 
        String KEGIATAN, Long PESERTA, String KETERANGAN, Long ID_PENGGUNA) {
            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.TANGGAL = TANGGAL;
            this.ID_TAMU = ID_SATUAN_KERJA;
            this.ID_TAMU = ID_TAMU;
            this.TGL_MASUK = TGL_MASUK;
            this.TGL_KELUAR = TGL_KELUAR;
            this.KEGIATAN = KEGIATAN;
            this.PESERTA = PESERTA;
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

    public String getTanggal() {
        return TANGGAL;
    }

    public void setTanggal(String tanggal) {
        this.TANGGAL = tanggal;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public Long getID_tamu() {
        return ID_TAMU;
    }

    public void setID_tamu(Long id_tamu) {
        this.ID_TAMU = id_tamu;
    }

    public String getTgl_masuk() {
        return TGL_MASUK;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.TGL_MASUK = tgl_masuk;
    }

    public String getTgl_keluar() {
        return TGL_KELUAR;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.TGL_KELUAR = tgl_keluar;
    }

    public String getKegiatan() {
        return KEGIATAN;
    }

    public void setKegiatan(String kegiatan) {
        this.KEGIATAN = kegiatan;
    }

    public Long getPeserta() {
        return PESERTA;
    }

    public void setPeserta(Long peserta) {
        this.PESERTA = peserta;
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
