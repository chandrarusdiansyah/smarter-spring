package com.sentinel.smarter.modules.smartproc.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity @Table(name="kontrak_jenis_kontrak")
@Immutable
public class ContractContractTypeView {
    @Id
    private Long ID_JENIS_KONTRAK;
    private String NAMA_JENIS_KONTRAK;
    private Long JUMLAH;

    public Long getID_jenis_kontrak() {
        return ID_JENIS_KONTRAK;
    }

    public String getNama_jenis_kontrak() {
        return NAMA_JENIS_KONTRAK;
    }    

    public Long getJumlah() {
        return JUMLAH;
    }
}
