package com.sentinel.smarter.modules.presence.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "pegawai")
@Immutable
public class EmployeeContractGenderGraph {
    @Id
    private String NAMA_JENIS_KELAMIN;
    private String WARNA_JENIS_KELAMIN;
    private Long JUMLAH;
    private Double PERSEN;

    public String getNama_jenis_kelamin() {
        return NAMA_JENIS_KELAMIN;
    }

    public String getWarna_jenis_kelamin() {
        return WARNA_JENIS_KELAMIN;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public Double getPersen() {
        return PERSEN;
    }
}
