package com.sentinel.smarter.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="pegawai")
@Immutable
public class EmployeeView {
    @Id
    private Long ID;
    private String NIP;
    private String NAMA;
    private String NAMA_SATUAN_KERJA;
    private String NAMA_DIVISI;
    private String NAMA_PENDIDIKAN;
    private String NAMA_GOLONGAN;
    private String NAMA_JABATAN;
    private String NAMA_UNIT_KERJA;

    public Long getID() {
        return ID;
    }

    public String getNip() {
        return NIP;
    }

    public String getNama() {
        return NAMA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public String getNama_divisi() {
        return NAMA_DIVISI;
    }

    public String getNama_pendidikan() {
        return NAMA_PENDIDIKAN;
    }

    public String getNama_golongan() {
        return NAMA_GOLONGAN;
    }

    public String getNama_jabatan() {
        return NAMA_JABATAN;
    }

    public String getNama_unit_kerja() {
        return NAMA_UNIT_KERJA;
    }
}
