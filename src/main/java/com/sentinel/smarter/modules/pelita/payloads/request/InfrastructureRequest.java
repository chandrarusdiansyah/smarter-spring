package com.sentinel.smarter.modules.pelita.payloads.request;

public class InfrastructureRequest {
    private String id_perusahaan;
    private Long id_satuan_kerja;
    private Long id_jenis_barang;
    private Long id_alokasi;
    private Long id_jenis_prasarana;
    private Long id_lantai;
    private String kode;
    private String nama;
    private String keterangan;
    private Long kapasitas;
    private Long id_kondisi;
    private String internal;
    private String sewa;
    private String rawat;
    private String foto;
    private Long id_pengguna;

    public InfrastructureRequest(
        String id_perusahaan, Long id_satuan_kerja, Long id_jenis_barang, Long id_alokasi, Long id_jenis_prasarana, Long id_lantai, 
        String kode, String nama, String keterangan, Long kapasitas, Long id_kondisi, String internal, 
        String rawat, String sewa, String foto, Long id_pengguna) {
            this.id_perusahaan = id_perusahaan;
            this.id_satuan_kerja = id_satuan_kerja;
            this.id_jenis_barang = id_jenis_barang;
            this.id_alokasi = id_alokasi;
            this.id_jenis_prasarana = id_jenis_prasarana;
            this.id_lantai = id_lantai;
            this.kode = kode;
            this.nama = nama;
            this.keterangan = keterangan;
            this.kapasitas = kapasitas;
            this.id_kondisi = id_kondisi;
            this.internal = internal;
            this.sewa = sewa;
            this.rawat = rawat;
            this.foto = foto;
            this.id_pengguna = id_pengguna;
    }

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public Long getID_satuan_kerja() {
        return id_satuan_kerja;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.id_satuan_kerja = id_satuan_kerja;
    }

    public Long getID_jenis_barang() {
        return id_jenis_barang;
    }

    public void setID_jenis_barang(Long id_jenis_barang) {
        this.id_jenis_barang = id_jenis_barang;
    }

    public Long getID_alokasi() {
        return id_alokasi;
    }

    public void setID_alokasi(Long id_alokasi) {
        this.id_alokasi = id_alokasi;
    }

    public Long getID_jenis_prasarana() {
        return id_jenis_prasarana;
    }

    public void setID_jenis_prasarana(Long id_jenis_prasarana) {
        this.id_jenis_prasarana = id_jenis_prasarana;
    }

    public Long getID_lantai() {
        return id_lantai;
    }

    public void setID_lantai(Long id_lantai) {
        this.id_lantai = id_lantai;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void seKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Long getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(Long kapasitas) {
        this.kapasitas = kapasitas;
    }

    public Long getID_kondisi() {
        return id_kondisi;
    }

    public void setID_kondisi(Long id_kondisi) {
        this.id_kondisi = id_kondisi;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getSewa() {
        return sewa;
    }

    public void setSewa(String sewa) {
        this.sewa = sewa;
    }

    public String getRawat() {
        return rawat;
    }

    public void setRawat(String rawat) {
        this.rawat = rawat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
