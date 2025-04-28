package com.sentinel.smarter.modules.supplies.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="barang_jenis_barang")
@Immutable
public class ItemItemTypeView {
    @Id
    private Long ID_JENIS_BARANG;
    private String NAMA_JENIS_BARANG;
    private Long JUMLAH;

    public Long getID_jenis_barang() {
        return ID_JENIS_BARANG;
    }

    public String getNama_jenis_barang() {
        return NAMA_JENIS_BARANG;
    }    

    public Long getJumlah() {
        return JUMLAH;
    }
}
