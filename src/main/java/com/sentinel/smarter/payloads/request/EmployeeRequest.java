package com.sentinel.smarter.payloads.request;

public class EmployeeRequest {
    private String id_perusahaan;
    private String nip;
    private String nama;
    private Long id_satuan_kerja;
    private Long id_divisi;
    private Long id_pendidikan;
    private Long id_golongan;
    private Long id_jabatan;
    private Long id_unit_kerja;
    private Long id_pengguna;

    public EmployeeRequest(String id_perusahaan, String nip, String nama, Long id_divisi, Long id_satuan_kerja, Long id_pendidikan, Long id_golongan, Long id_jabatan, Long id_unit_kerja, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.nip = nip;
        this.nama = nama;
        this.id_satuan_kerja = id_satuan_kerja;
        this.id_divisi = id_divisi;
        this.id_pendidikan = id_pendidikan;
        this.id_golongan = id_golongan;
        this.id_jabatan = id_jabatan;
        this.id_unit_kerja = id_unit_kerja;
        this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getID_satuan_kerja() {
        return id_satuan_kerja;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.id_satuan_kerja = id_satuan_kerja;
    }

    public Long getID_divisi() {
        return id_divisi;
    }

    public void setID_divisi(Long id_divisi) {
        this.id_divisi = id_divisi;
    }

    public Long getID_pendidikan() {
        return id_pendidikan;
    }

    public void setID_pendidikan(Long id_pendidikan) {
        this.id_pendidikan = id_pendidikan;
    }

    public Long getID_golongan() {
        return id_golongan;
    }

    public void setID_golongan(Long id_golongan) {
        this.id_golongan = id_golongan;
    }

    public Long getID_jabatan() {
        return id_jabatan;
    }

    public void setID_jabatan(Long id_jabatan) {
        this.id_jabatan = id_jabatan;
    }

    public Long getID_unit_kerja() {
        return id_unit_kerja;
    }

    public void setID_unit_kerja(Long id_unit_kerja) {
        this.id_unit_kerja = id_unit_kerja;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
