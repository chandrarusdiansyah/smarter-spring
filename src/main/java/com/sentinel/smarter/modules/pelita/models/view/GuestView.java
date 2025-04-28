package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="tamu")
@Immutable
public class GuestView {
    @Id
    private Long ID;
    private String NAMA_JENIS_TAMU;
    private String NAMA;
    private String INSTANSI;
    private String ALAMAT;
    private String TELEPON;
    private String EMAIL;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getNama_jenis_tamu() {
        return NAMA_JENIS_TAMU;
    }

    public String getNama() {
        return NAMA;
    }

    public String getInstansi() {
        return INSTANSI;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public String getTelepon() {
        return TELEPON;
    }

    public String getEmail() {
        return EMAIL;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }
}
