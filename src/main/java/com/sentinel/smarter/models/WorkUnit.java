package com.sentinel.smarter.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_unit_kerja")
public class WorkUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String KODE;
    private String NAMA;
    private String KETERANGAN;
    private Long ID_PENGGUNA;

    public WorkUnit() {
  
    }

    public WorkUnit(String ID_PERUSAHAAN, String KODE, String NAMA, String KETERANGAN, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
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

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
