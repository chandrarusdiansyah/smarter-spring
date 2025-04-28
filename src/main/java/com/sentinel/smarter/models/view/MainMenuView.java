package com.sentinel.smarter.models.view;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="menu_utama")
@Immutable
public class MainMenuView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Long ID_JENIS_PENGGUNA;
    private String NAMA;
    private String IKON;
    private String TAUTAN;
    private String DETAIL;

    public Long getID() {
        return ID;
    }

    public Long getID_jenis_pengguna() {
        return ID_JENIS_PENGGUNA;
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

    public String getDetail() {
        return DETAIL;
    }
}
