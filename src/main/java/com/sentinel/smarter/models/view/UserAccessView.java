package com.sentinel.smarter.models.view;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name="pengguna_akses")
@Immutable
public class UserAccessView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String NAMA_APLIKASI;
    private String NAMA_JENIS_PENGGUNA;
    private Long JUMLAH;

    public String getID() {
        return ID;
    }

    public String getNama_aplikasi() {
        return NAMA_APLIKASI;
    }

    public String getNama_jenis_pengguna() {
        return NAMA_JENIS_PENGGUNA;
    }

    public Long getJumlah() {
        return JUMLAH;
    }
}
