package com.sentinel.smarter.modules.supplies.models.view;

import org.hibernate.annotations.Immutable;
import jakarta.persistence.*; 

@Entity@Table(name="barang")
@Immutable
public class ItemView {
    @Id
    private Long ID;
    private String TGL_REGISTRASI;
    private String KODE;
    private String NAMA_JENIS_BARANG;
    private String NAMA;
    private String NAMA_SATUAN;
    private Long HARGA;
    private String GAMBAR;
    private Long JUMLAH;
    private String KETERANGAN;

    public Long getID() {
        return ID;
    }

    public String getTgl_registrasi() {
        return TGL_REGISTRASI;
    }

    public String getKode() {
        return KODE;
    }    

    public String getNama_jenis_barang() {
        return NAMA_JENIS_BARANG;
    }    
    
    public String getNama() {
        return NAMA;
    }
    
    public String getNama_satuan() {
        return NAMA_SATUAN;
    }

    public Long getHarga() {
        return HARGA;
    }

    public String getGambar() {
        return GAMBAR;
    }

    public Long getJumlah() {
        return JUMLAH;
    }

    public String getKeterangan() {
        return KETERANGAN;
    }
}
