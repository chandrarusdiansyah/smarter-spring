package com.sentinel.smarter.modules.smartproc.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity @Table(name="kontrak_satuan_kerja")
@Immutable
public class ContractWorkPlaceView {
    @Id
    private String ID;
    private Long ID_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private Long ID_DIVISI;
    private String NAMA_DIVISI;
    private Long TENDER;
    private Long NONTENDER;

    public String getID() {
        return ID;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public String getNama_satuan_kerja() {
        return NAMA_SATUAN_KERJA;
    }

    public Long getID_divisi() {
        return ID_DIVISI;
    }

    public String getNama_divisi() {
        return NAMA_DIVISI;
    }    

    public Long getTender() {
        return TENDER;
    }

    public Long getNontender() {
        return NONTENDER;
    }
}
