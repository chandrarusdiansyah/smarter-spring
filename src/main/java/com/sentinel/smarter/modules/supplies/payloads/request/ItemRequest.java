package com.sentinel.smarter.modules.supplies.payloads.request;

public class ItemRequest {
    private String id_perusahaan;
    private String kode;
    private Long id_jenis_barang;
    private String nama;
    private Long id_satuan;
    private Long harga;
    private Long jumlah;
    private String gambar;
    private String keterangan;
    private Long id_pengguna;

    public ItemRequest(String id_perusahaan, String kode, Long id_jenis_barang, String nama, Long id_satuan, Long harga, Long jumlah, String gambar, String keterangan, Long id_pengguna) {
        this.id_perusahaan = id_perusahaan;
        this.kode = kode;
        this.id_jenis_barang = id_jenis_barang;
        this.nama = nama;
        this.id_satuan = id_satuan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.gambar = gambar;
        this.keterangan = keterangan;
        this.id_pengguna = id_pengguna;
    } 

    public String getID_perusahaan() {
        return id_perusahaan;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.id_perusahaan = id_perusahaan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Long getID_jenis_barang() {
        return id_jenis_barang;
    }

    public void setID_jenis_barang(Long id_jenis_barang) {
        this.id_jenis_barang = id_jenis_barang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Long getID_satuan() {
        return id_satuan;
    }

    public void setID_satuan(Long id_satuan) {
        this.id_satuan = id_satuan;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }   

    public Long getJumlah() {
        return jumlah;
    }

    public void setJumlah(Long jumlah) {
        this.jumlah = jumlah;
    }   

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Long getID_pengguna() {
        return id_pengguna;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.id_pengguna = id_pengguna;
    }
}
