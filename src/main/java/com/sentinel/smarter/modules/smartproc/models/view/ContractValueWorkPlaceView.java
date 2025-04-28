package com.sentinel.smarter.modules.smartproc.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity @Table(name="nilai_satuan_kerja")
@Immutable
public class ContractValueWorkPlaceView {
    @Id
    private String ID;
    private Long ID_SATUAN_KERJA;
    private String NAMA_SATUAN_KERJA;
    private Long ID_DIVISI;
    private String NAMA_DIVISI;
    private Long T_NILAI_KONTRAK;
    private Long T_NILAI_ADENDUM;
    private Long T_NILAI_KONTRAK_AKHIR;
    private Long NT_NILAI_KONTRAK;
    private Long NT_NILAI_ADENDUM;
    private Long NT_NILAI_REALISASI;

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

    public Long getT_nilai_kontrak() {
        return T_NILAI_KONTRAK;
    }

    public Long getT_nilai_adendum() {
        return T_NILAI_ADENDUM;
    }

    public Long getT_nilai_kontrak_akhir() {
        return T_NILAI_KONTRAK_AKHIR;
    }

    public Long getNt_nilai_kontrak() {
        return NT_NILAI_KONTRAK;
    }

    public Long getNt_nilai_adendum() {
        return NT_NILAI_ADENDUM;
    }

    public Long getNt_nilai_realisasi() {
        return NT_NILAI_REALISASI;
    }
}
