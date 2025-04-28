package com.sentinel.smarter.modules.presence.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "pegawai")
@Immutable
public class EmployeeContractWorkTypeGraph {
    @Id
    private String NAMA_JENIS_KERJA;
    private String WARNA_JENIS_KERJA;
    private Long JUMLAH;
    private Double PERSEN;

    public String getNama_jenis_kerja() {
        return NAMA_JENIS_KERJA;
    }

    public String getWarna_jenis_kerja() {
        return WARNA_JENIS_KERJA;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public Double getPersen() {
        return PERSEN;
    }
}
