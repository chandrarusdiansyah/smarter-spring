package com.sentinel.smarter.modules.pelita.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*;

@Entity
@Table(name="pesan_prasarana")
@Immutable
public class OrderInfrastructureView {
    @Id
    private Long ID;
    private String NAMA_JENIS_TAMU;
    private String NAMA_TAMU;
    private String INSTANSI_TAMU;
    private String KODE_PRASARANA;
    private String NAMA_PRASARANA;
    private String TANGGAL;
    private String DARI_JAM;
    private String SAMPAI_JAM;

    public Long getID() {
        return ID;
    }

    public String getNama_jenis_tamu() {
        return NAMA_JENIS_TAMU;
    }

    public String getNama_tamu() {
        return NAMA_TAMU;
    }

    public String getInstansi_tamu() {
        return INSTANSI_TAMU;
    }

    public String getKode_prasarana() {
        return KODE_PRASARANA;
    }

    public String getNama_prasarana() {
        return NAMA_PRASARANA;
    }

    public String getTanggal() {
        return TANGGAL;
    }

    public String getDari_jam() {
        return DARI_JAM;
    }

    public String getSampai_jam() {
        return SAMPAI_JAM;
    }
}
