package com.sentinel.smarter.modules.simpatik.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name = "alokasi_satuan_kerja")
@Immutable
public class AlocationWorkPlaceView {
    @Id
    private String KODE_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private String LOKASI_SATUAN_KERJA;
    private Long BELUM_DITENTUKAN;
    private Long BAIK;
    private Long RUSAK_RINGAN;
    private Long RUSAK_BERAT;
    private Long TOTAL;

    public String getKode_satuan_kerja() {
        return KODE_SATUAN_KERJA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public String getLokasi_satuan_kerja() {
        return LOKASI_SATUAN_KERJA;
    }

    public Long getBelum_ditentukan() {
        return BELUM_DITENTUKAN;
    }

    public Long getBaik() {
        return BAIK;
    }

    public Long getRusak_ringan() {
        return RUSAK_RINGAN;
    }

    public Long getRusak_berat() {
        return RUSAK_BERAT;
    }

    public Long getTotal() {
        return TOTAL;
    }
}
