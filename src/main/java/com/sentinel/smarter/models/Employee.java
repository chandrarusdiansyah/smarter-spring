package com.sentinel.smarter.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_pegawai")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private String NIP;
    private String NAMA;
    private Long ID_SATUAN_KERJA;
    private Long ID_DIVISI;
    private Long ID_PENDIDIKAN;
    private Long ID_GOLONGAN;
    private Long ID_JABATAN;
    private Long ID_UNIT_KERJA;
    private Long ID_PENGGUNA;

    public Employee() {
  
    }

    public Employee(String ID_PERUSAHAAN, String NIP, String NAMA, Long ID_SATUAN_KERJA, Long ID_DIVISI, Long ID_PENDIDIKAN, Long ID_GOLONGAN, Long ID_JABATAN, Long ID_UNIT_KERJA, Long ID_PENGGUNA) {
        this.ID_PERUSAHAAN = ID_PERUSAHAAN;
        this.NIP = NIP;
        this.NAMA = NAMA;
        this.ID_SATUAN_KERJA = ID_SATUAN_KERJA;
        this.ID_DIVISI = ID_DIVISI;
        this.ID_PENDIDIKAN = ID_PENDIDIKAN;
        this.ID_GOLONGAN = ID_GOLONGAN;
        this.ID_JABATAN = ID_JABATAN;
        this.ID_UNIT_KERJA = ID_UNIT_KERJA;
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
    
    public String getNip() {
        return NIP;
    }

    public void setNip(String nip) {
        this.NIP = nip;
    }
    
    public String getNama() {
        return NAMA;
    }

    public void setNama(String nama) {
        this.NAMA = nama;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public Long getID_divisi() {
        return ID_DIVISI;
    }

    public void setID_divisi(Long id_divisi) {
        this.ID_DIVISI = id_divisi;
    }

    public Long getID_pendidikan() {
        return ID_PENDIDIKAN;
    }

    public void setID_pendidikan(Long id_pendidikan) {
        this.ID_PENDIDIKAN = id_pendidikan;
    }

    public Long getID_golongan() {
        return ID_GOLONGAN;
    }

    public void setID_golongan(Long id_golongan) {
        this.ID_GOLONGAN = id_golongan;
    }

    public Long getID_jabatan() {
        return ID_JABATAN;
    }

    public void setID_jabatan(Long id_jabatan) {
        this.ID_JABATAN = id_jabatan;
    }

    public Long getID_unit_kerja() {
        return ID_UNIT_KERJA;
    }

    public void setID_unit_kerja(Long id_unit_kerja) {
        this.ID_UNIT_KERJA = id_unit_kerja;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
