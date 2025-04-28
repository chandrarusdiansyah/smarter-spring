package com.sentinel.smarter.models.view;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="menu")
@Immutable
public class MenuView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String NAMA_APLIKASI;
    private String NAMA_JENIS_MENU;
    private String NAMA;
    private String IKON;
    private String TAUTAN;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getNama_aplikasi() {
        return NAMA_APLIKASI;
    }

    public String getNama_jenis_menu() {
        return NAMA_JENIS_MENU;
    }

    public String getNama() {
        return NAMA;
    }

    public String getIkon() {
        return IKON;
    }

    public String getTautan() {
        return TAUTAN;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }
}
