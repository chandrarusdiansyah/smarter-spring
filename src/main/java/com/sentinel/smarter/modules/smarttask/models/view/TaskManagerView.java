package com.sentinel.smarter.modules.smarttask.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="tugas")
@Immutable
public class TaskManagerView {
    @Id
    private Long ID;
    private String NAMA_PROYEK;
    private String TUGAS;
    private String NAMA_PEGAWAI;
    private String NAMA_DIVISI;
    private String NAMA_JABATAN;
    private String NAMA_TUGAS_PRIORITAS;
    private String TGL_MULAI;
    private String TGL_SELESAI;
    private Long HARI_KERJA;
    private String NAMA_TUGAS_STATUS;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getNama_proyek() {
        return NAMA_PROYEK;
    }

    public String getTugas() {
        return TUGAS;
    }

    public String getNama_pegawai() {
        return NAMA_PEGAWAI;
    }

    public String getNama_divisi() {
        return NAMA_DIVISI;
    }

    public String getNama_jabatan() {
        return NAMA_JABATAN;
    }

    public String getNama_tugas_prioritas() {
        return NAMA_TUGAS_PRIORITAS;
    }

    public String getTgl_mulai() {
        return TGL_MULAI;
    }

    public String getTgl_selesai() {
        return TGL_SELESAI;
    }

    public Long getHari_kerja() {
        return HARI_KERJA;
    }

    public String getNama_tugas_status() {
        return NAMA_TUGAS_STATUS;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }
}
