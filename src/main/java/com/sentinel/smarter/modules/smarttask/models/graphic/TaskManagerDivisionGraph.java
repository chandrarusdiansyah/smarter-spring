package com.sentinel.smarter.modules.smarttask.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "tugas")
@Immutable
public class TaskManagerDivisionGraph {
    @Id
    private String NAMA_DIVISI;
    private Long DONE;
    private Long ONGOING;

    public String getNama_divisi() {
        return NAMA_DIVISI;
    }

    public Long getDone() {
        return DONE;
    }

    public Long getOnGoing() {
        return ONGOING;
    }
}
