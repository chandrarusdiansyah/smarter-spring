package com.sentinel.smarter.modules.smarttask.models.reference;

import org.springframework.data.annotation.Immutable;

import jakarta.persistence.*; 

@Entity @Table(name = "tbl_tugas_status")
@Immutable
public class TaskStatusRef {
    @Id
    private Long ID;
    private String KODE;
    private String NAMA;
    private String WARNA;

    public Long getID() {
        return ID;
    }

    public String getKode() {
        return KODE;
    }

    public String getNama() {
        return NAMA;
    }
    
    public String getWarna() {
        return WARNA;
    }
}
