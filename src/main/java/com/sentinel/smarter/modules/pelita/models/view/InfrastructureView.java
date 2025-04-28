package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="prasarana")
@Immutable
public class InfrastructureView {
    @Id
    private Long ID;
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private String KODE_BARANG;
    private String NAMA_BARANG;
    private String MERK_BARANG;
    private String NAMA_JENIS_PRASARANA;
    private String NAMA_LANTAI;
    private String KODE;
    private String NAMA;
    private String KETERANGAN;
    private Long KAPASITAS;
    private Long ID_KONDISI;
    private String NAMA_KONDISI;
    private String INTERNAL;
    private String SEWA;
    private String RAWAT;
    private String FOTO;

    public Long getID() {
        return ID;
    }

    public String getKode_satuan_kerja() {
        return KODE_SATUAN_KERJA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public String getLokasi_satuan_kerja() {
        return LOKASI_SATUAN_KERJA;
    }

    public String getKode_barang() {
        return KODE_BARANG;
    }

    public String getNama_barang() {
        return NAMA_BARANG;
    }

    public String getMerk_barang() {
        return MERK_BARANG;
    }

    public String getNama_jenis_prasarana() {
        return NAMA_JENIS_PRASARANA;
    }

    public String getNama_lantai() {
        return NAMA_LANTAI;
    }

    public String getKode() {
        return KODE;
    }

    public String getNama() {
        return NAMA;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }

    public Long getKapasitas() {
        return KAPASITAS;
    }

    public Long getID_kondisi() {
        return ID_KONDISI;
    }

    public String getNama_kondisi() {
        return NAMA_KONDISI;
    }

    public String getInternal() {
        return INTERNAL;
    }

    public String getSewa() {
        return SEWA;
    }

    public String getRawat() {
        return RAWAT;
    }

    public String getFoto() {
        return FOTO;
    }
}
