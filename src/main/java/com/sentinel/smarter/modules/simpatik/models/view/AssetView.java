package com.sentinel.smarter.modules.simpatik.models.view;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity@Table(name = "barang")
@Immutable
public class AssetView {
    @Id
    private Long ID;
    private String KODE_JENIS_BARANG;
    private String NAMA_JENIS_BARANG;
    private String KODE;
    private String NAMA;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getKode_jenis_barang() {
        return KODE_JENIS_BARANG;
    }

    public String getNama_jenis_barang() {
        return NAMA_JENIS_BARANG;
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
}
