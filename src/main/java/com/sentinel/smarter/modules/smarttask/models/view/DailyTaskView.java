package com.sentinel.smarter.modules.smarttask.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="tugas")
@Immutable
public class DailyTaskView {
    @Id
    private Long ID;
    private String TANGGAL;
    private String NAMA_PROYEK;
    private String TUGAS;
    private String KEGIATAN;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public String getNama_proyek() {
        return NAMA_PROYEK;
    }

    public String getTugas() {
        return TUGAS;
    }

    public String getKegiatan() {
        return KEGIATAN;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }
}
