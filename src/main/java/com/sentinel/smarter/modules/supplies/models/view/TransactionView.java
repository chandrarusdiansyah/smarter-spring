package com.sentinel.smarter.modules.supplies.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="transaksi")
@Immutable
public class TransactionView {
    @Id
    private Long ID;
    private Long ID_JENIS_TRANSAKSI;
    private String NAMA_JENIS_TRANSAKSI;
    private String NOMOR;
    private String TANGGAL;
    private Long ID_PEGAWAI;
    private String NAMA_PEGAWAI;
    private String NAMA_SATUAN_KERJA;
    private String NAMA_DIVISI;
    private String NAMA_JABATAN;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_transaksi() {
        return ID_JENIS_TRANSAKSI;
    }

    public String getNama_jenis_transaksi() {
        return NAMA_JENIS_TRANSAKSI;
    }  

    public String getNomor() {
        return NOMOR;
    }  

    public String getTanggal() {
        return TANGGAL;
    }  

    public Long getID_pegawai() {
        return ID_PEGAWAI;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
    }  

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }  

    public String getNama_divisi() {
        return NAMA_DIVISI;
    }  

    public String getNama_jabatan() {
        return NAMA_JABATAN;
    }  

    public String getKeterangan() {
        return KETERANGAN;
    }  
}
