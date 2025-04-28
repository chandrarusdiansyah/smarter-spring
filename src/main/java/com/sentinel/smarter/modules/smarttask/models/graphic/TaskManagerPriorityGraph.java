package com.sentinel.smarter.modules.smarttask.models.graphic;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "tugas")
@Immutable
public class TaskManagerPriorityGraph {
    @Id
    private String NAMA_TUGAS_PRIORITAS;
    private Long DONE;
    private Long ONGOING;

    public String getNama_tugas_prioritas() {
        return NAMA_TUGAS_PRIORITAS;
    }

    public Long getDone() {
        return DONE;
    }

    public Long getOnGoing() {
        return ONGOING;
    }
}
