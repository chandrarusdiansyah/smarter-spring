package com.sentinel.smarter.modules.simpatik.models.reference;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "barang")
@Immutable
public class AssetRef {
    @Id
    private Long ID;
    private String KODE;
    private String NAMA;

    public Long getID() {
        return ID;
    }

    public String getKode() {
        return KODE;
    }

    public String getNama() {
        return NAMA;
    }
}
