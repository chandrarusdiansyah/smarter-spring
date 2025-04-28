package com.sentinel.smarter.modules.smarttask.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "tugas")
@Immutable
public class TaskManagerWorkPlaceGraph {
    @Id
    private String NAMA_SATUAN_KERJA;
    private Long DONE;
    private Long ONGOING;

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public Long getDone() {
        return DONE;
    }

    public Long getOnGoing() {
        return ONGOING;
    }
}
