package com.sentinel.smarter.modules.smarttask.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "tugas")
@Immutable
public class TaskManagerStatusGraph {
    @Id
    private String NAMA_TUGAS_STATUS;
    private String WARNA_TUGAS_STATUS;
    private Long JUMLAH;
    private Double PERSEN;

    public String getNama_tugas_status() {
        return NAMA_TUGAS_STATUS;
    }

    public String getWarna_tugas_status() {
        return WARNA_TUGAS_STATUS;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public Double getPersen() {
        return PERSEN;
    }
}
