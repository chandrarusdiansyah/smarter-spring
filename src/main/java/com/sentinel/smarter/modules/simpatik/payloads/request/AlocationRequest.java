package com.sentinel.smarter.modules.simpatik.payloads.request;

public class AlocationRequest {
    private String id_perusahaan;
    private Long id_satuan_kerja;
    private Long id_barang;
    private String nup;
    private Long id_kondisi_barang;

    private Long id_jenis_dokumen;
    private Long id_kepemilikan;
    private Long id_jenis_sertifikat;
    private String merk;
    private String tipe;

    private String tgl_perolehan;
    private String tgl_awal_pakai;
    private long nilai_perolehan_pertama;
    private long nilai_mutasi;
    private long nilai_perolehan;

    private long nilai_penyusutan;
    private long nilai_buku;
    private Long id_satuan;
    private Double kuantitas;
    private Double luas_tanah_keseluruhan;

    private Double luas_tanah_untuk_bangunan;
    private Double luas_tanah_untuk_sarana_lingkungan;
    private Double luas_lahan_kosong;
    private Double luas_bangunan;
    private Double luas_dasar_bangunan;

    private Long lantai;
    private Long id_status_guna;
    private String no_psp;
    private String tgl_psp;
    private String no_bpkb;

    private String no_polisi;
    private String pemakai;
    private String alamat;
    private String rt_rw;
    private String kelurahan;

    private String kecamatan;
    private String kode_kabupaten_kota;
    private String kabupaten_kota;
    private String kode_provinsi;
    private String provinsi;

    private String kode_pos;
    private String alamat_lain;
    private Long kib;
    private Double sbsk;
    private Double optimalisasi;

    private Long id_status_sbsn;
    private String no_tiket_usul_psp;
    private String intra_ekstra;
    private String bpybds;
    private String henti_guna;

    private String kemitraan;
    private String hilang;
    private String dktp;
    private String usul_rusak_berat;
    private String usul_hapus;

    private Long sisa_umur;
    private String sakti;
    private String kode_registrasi_sakti;
    private String foto;
    private Long id_pengguna;

    public AlocationRequest(
        String id_perusahaan, Long id_satuan_kerja, Long id_barang, String nup, Long id_kondisi_barang,
        Long id_jenis_dokumen, Long id_kepemilikan, Long id_jenis_sertifikat, String merk, String tipe,
        String tgl_perolehan, String tgl_awal_pakai, long nilai_perolehan_pertama, long nilai_mutasi, long nilai_perolehan,
        long nilai_penyusutan, long nilai_buku, Long id_satuan, Double kuantitas, Double luas_tanah_keseluruhan,
        Double luas_tanah_untuk_bangunan, Double luas_tanah_untuk_sarana_lingkungan, Double luas_lahan_kosong, Double luas_bangunan, Double luas_dasar_bangunan,
        Long lantai, Long id_status_guna, String no_psp, String tgl_psp, String no_bpkb,
        String no_polisi, String pemakai, String alamat, String rt_rw, String kelurahan,
        String kecamatan, String kode_kabupaten_kota, String kabupaten_kota, String kode_provinsi, String provinsi,
        String kode_pos, String alamat_lain, Long kib, Double sbsk, Double optimalisasi,
        Long id_status_sbsn, String no_tiket_usul_psp, String intra_ekstra, String bpybds, String henti_guna,
        String kemitraan, String hilang, String dktp, String usul_rusak_berat, String usul_hapus,
        Long sisa_umur, String sakti, String kode_registrasi_sakti, String foto, Long id_pengguna) {

            this.id_perusahaan = id_perusahaan;
            this.id_satuan_kerja = id_satuan_kerja;
            this.id_barang = id_barang;
            this.nup = nup;
            this.id_kondisi_barang = id_kondisi_barang;

            this.id_jenis_dokumen = id_jenis_dokumen;
            this.id_kepemilikan = id_kepemilikan;
            this.id_jenis_sertifikat = id_jenis_sertifikat;
            this.merk = merk;
            this.tipe = tipe;

            this.tgl_perolehan = tgl_perolehan;
            this.tgl_awal_pakai = tgl_awal_pakai;
            this.nilai_perolehan_pertama = nilai_perolehan_pertama;
            this.nilai_mutasi = nilai_mutasi;
            this.nilai_perolehan = nilai_perolehan;

            this.nilai_penyusutan = nilai_penyusutan;
            this.nilai_buku = nilai_buku;
            this.id_satuan = id_satuan;
            this.kuantitas = kuantitas;
            this.luas_tanah_keseluruhan = luas_tanah_keseluruhan;

            this.luas_tanah_untuk_bangunan = luas_tanah_untuk_bangunan;
            this.luas_tanah_untuk_sarana_lingkungan = luas_tanah_untuk_sarana_lingkungan;
            this.luas_lahan_kosong = luas_lahan_kosong;
            this.luas_bangunan = luas_bangunan;
            this.luas_dasar_bangunan = luas_dasar_bangunan;

            this.lantai = lantai;
            this.id_status_guna = id_status_guna;
            this.no_psp = no_psp;
            this.tgl_psp = tgl_psp;
            this.no_bpkb = no_bpkb;

            this.no_polisi = no_polisi;
            this.pemakai = pemakai;
            this.alamat = alamat;
            this.rt_rw = rt_rw;
            this.kelurahan = kelurahan;

            this.kecamatan = kecamatan;
            this.kode_kabupaten_kota = kode_kabupaten_kota;
            this.kabupaten_kota = kabupaten_kota;
            this.kode_provinsi = kode_provinsi;
            this.provinsi = provinsi;

            this.kode_pos = kode_pos;
            this.alamat_lain = alamat_lain;
            this.kib = kib;
            this.sbsk = sbsk;
            this.optimalisasi = optimalisasi;

            this.id_status_sbsn = id_status_sbsn;
            this.no_tiket_usul_psp = no_tiket_usul_psp;
            this.intra_ekstra = intra_ekstra;
            this.bpybds = bpybds;
            this.henti_guna = henti_guna;

            this.kemitraan = kemitraan;
            this.hilang = hilang;
            this.dktp = dktp;
            this.usul_rusak_berat = usul_rusak_berat;
            this.usul_hapus = usul_hapus;

            this.sisa_umur = sisa_umur;
            this.sakti = sakti;
            this.kode_registrasi_sakti = kode_registrasi_sakti;
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

    public Long getID_barang() {
        return id_barang;
    }

    public void setID_barang(Long id_barang) {
        this.id_barang = id_barang;
    }

    public String getNup() {
        return nup;
    }

    public void setNup(String nup) {
        this.nup = nup;
    }

    public Long getID_kondisi_barang() {
        return id_kondisi_barang;
    }

    public void setID_kondisi_barang(Long id_kondisi_barang) {
        this.id_kondisi_barang = id_kondisi_barang;
    }

    public Long getID_jenis_dokumen() {
        return id_jenis_dokumen;
    }

    public void setID_jenis_dokumen(Long id_jenis_dokumen) {
        this.id_jenis_dokumen = id_jenis_dokumen;
    }

    public Long getID_kepemilikan() {
        return id_kepemilikan;
    }

    public void setID_kepemilikan(Long id_kepemilikan) {
        this.id_kepemilikan = id_kepemilikan;
    }

    public Long getID_jenis_sertifikat() {
        return id_jenis_sertifikat;
    }

    public void setID_jenis_sertifikat(Long id_jenis_sertifikat) {
        this.id_jenis_sertifikat = id_jenis_sertifikat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTgl_perolehan() {
        return tgl_perolehan;
    }

    public void setTgl_perolehan(String tgl_perolehan) {
        this.tgl_perolehan = tgl_perolehan;
    }

    public String getTgl_awal_pakai() {
        return tgl_awal_pakai;
    }

    public void setTgl_awal_pakai(String tgl_awal_pakai) {
        this.tgl_awal_pakai = tgl_awal_pakai;
    }

    public long getNilai_perolehan_pertama() {
        return nilai_perolehan_pertama;
    }

    public void setNilai_perolehan_pertama(long nilai_perolehan_pertama) {
        this.nilai_perolehan_pertama = nilai_perolehan_pertama;
    }

    public long getNilai_mutasi() {
        return nilai_mutasi;
    }

    public void setNilai_mutasi(long nilai_mutasi) {
        this.nilai_mutasi = nilai_mutasi;
    }

    public long getNilai_perolehan() {
        return nilai_perolehan;
    }

    public void setNilai_perolehan(long nilai_perolehan) {
        this.nilai_perolehan = nilai_perolehan;
    }

    public long getNilai_penyusutan() {
        return nilai_penyusutan;
    }

    public void setNilai_penyusutan(long nilai_penyusutan) {
        this.nilai_penyusutan = nilai_penyusutan;
    }

    public long getNilai_buku() {
        return nilai_buku;
    }

    public void setNilai_buku(long nilai_buku) {
        this.nilai_buku = nilai_buku;
    }

    public Long getID_satuan() {
        return id_satuan;
    }

    public void setID_satuan(Long id_satuan) {
        this.id_satuan = id_satuan;
    }

    public Double getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(Double kuantitas) {
        this.kuantitas = kuantitas;
    }

    public Double getLuas_tanah_keseluruhan() {
        return luas_tanah_keseluruhan;
    }

    public void setLuas_tanah_keseluruhan(Double luas_tanah_keseluruhan) {
        this.luas_tanah_keseluruhan = luas_tanah_keseluruhan;
    }

    public Double getLuas_tanah_untuk_bangunan() {
        return luas_tanah_untuk_bangunan;
    }

    public void setLuas_tanah_untuk_bangunan(Double luas_tanah_untuk_bangunan) {
        this.luas_tanah_untuk_bangunan = luas_tanah_untuk_bangunan;
    }

    public Double getLuas_tanah_untuk_sarana_lingkungan() {
        return luas_tanah_untuk_sarana_lingkungan;
    }

    public void setLuas_tanah_untuk_sarana_lingkungan(Double luas_tanah_untuk_sarana_lingkungan) {
        this.luas_tanah_untuk_sarana_lingkungan = luas_tanah_untuk_sarana_lingkungan;
    }

    public Double getLuas_lahan_kosong() {
        return luas_lahan_kosong;
    }

    public void setLuas_lahan_kosong(Double luas_lahan_kosong) {
        this.luas_lahan_kosong = luas_lahan_kosong;
    }

    public Double getLuas_bangunan() {
        return luas_bangunan;
    }

    public void setLuas_bangunan(Double luas_bangunan) {
        this.luas_bangunan = luas_bangunan;
    }

    public Double getLuas_dasar_bangunan() {
        return luas_dasar_bangunan;
    }

    public void setLuas_dasar_bangunan(Double luas_dasar_bangunan) {
        this.luas_dasar_bangunan = luas_dasar_bangunan;
    }

    public Long getLantai() {
        return lantai;
    }

    public void setLantai(Long lantai) {
        this.lantai = lantai;
    }

    public Long getID_status_guna() {
        return id_status_guna;
    }

    public void setID_status_guna(Long id_status_guna) {
        this.id_status_guna = id_status_guna;
    }

    public String getNo_psp() {
        return no_psp;
    }

    public void setNo_psp(String no_psp) {
        this.no_psp = no_psp;
    }

    public String getTgl_psp() {
        return tgl_psp;
    }

    public void setTgl_psp(String tgl_psp) {
        this.tgl_psp = tgl_psp;
    }

    public String getNo_bpkb() {
        return no_bpkb;
    }

    public void setNo_bpkb(String no_bpkb) {
        this.no_bpkb = no_bpkb;
    }

    public String getNo_polisi() {
        return no_polisi;
    }

    public void setNo_polisi(String no_polisi) {
        this.no_polisi = no_polisi;
    }

    public String getPemakai() {
        return pemakai;
    }

    public void setPemakai(String pemakai) {
        this.pemakai = pemakai;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt_rw() {
        return rt_rw;
    }

    public void setRt_rw(String rt_rw) {
        this.rt_rw = rt_rw;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKode_kabupaten_kota() {
        return kode_kabupaten_kota;
    }

    public void setKode_kabupaten_kota(String kode_kabupaten_kota) {
        this.kode_kabupaten_kota = kode_kabupaten_kota;
    }

    public String getKabupaten_kota() {
        return kabupaten_kota;
    }

    public void setKabupaten_kota(String kabupaten_kota) {
        this.kabupaten_kota = kabupaten_kota;
    }

    public String getKode_provinsi() {
        return kode_provinsi;
    }

    public void setKode_provinsi(String kode_provinsi) {
        this.kode_provinsi = kode_provinsi;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(String kode_pos) {
        this.kode_pos = kode_pos;
    }

    public String getAlamat_lain() {
        return alamat_lain;
    }

    public void setAlamat_lain(String alamat_lain) {
        this.alamat_lain = alamat_lain;
    }

    public Long getKib() {
        return kib;
    }

    public void setKib(Long kib) {
        this.kib = kib;
    }

    public Double getSbsk() {
        return sbsk;
    }

    public void setSbsk(Double sbsk) {
        this.sbsk = sbsk;
    }

    public Double getOptimalisasi() {
        return optimalisasi;
    }

    public void setNo_tiket_usul_psp(Double optimalisasi) {
        this.optimalisasi = optimalisasi;
    }

    public Long getID_status_sbsn() {
        return id_status_sbsn;
    }

    public void setID_status_sbsn(Long id_status_sbsn) {
        this.id_status_sbsn = id_status_sbsn;
    }

    public String getNo_tiket_usul_psp() {
        return no_tiket_usul_psp;
    }

    public void setNo_tiket_usul_psp(String no_tiket_usul_psp) {
        this.no_tiket_usul_psp = no_tiket_usul_psp;
    }

    public String getIntra_ekstra() {
        return intra_ekstra;
    }

    public void setIntra_ekstra(String intra_ekstra) {
        this.intra_ekstra = intra_ekstra;
    }

    public String getBpybds() {
        return bpybds;
    }

    public void setBpybds(String bpybds) {
        this.bpybds = bpybds;
    }

    public String getHenti_guna() {
        return henti_guna;
    }

    public void setHenti_guna(String henti_guna) {
        this.henti_guna = henti_guna;
    }

    public String getKemitraan() {
        return kemitraan;
    }

    public void setKemitraan(String kemitraan) {
        this.kemitraan = kemitraan;
    }

    public String getHilang() {
        return hilang;
    }

    public void setHilang(String hilang) {
        this.hilang = hilang;
    }

    public String getDktp() {
        return dktp;
    }

    public void setDktp(String dktp) {
        this.dktp = dktp;
    }

    public String getUsul_rusak_berat() {
        return usul_rusak_berat;
    }

    public void setUsul_rusak_berat(String usul_rusak_berat) {
        this.usul_rusak_berat = usul_rusak_berat;
    }

    public String getUsul_hapus() {
        return usul_hapus;
    }

    public void setUsul_hapus(String usul_hapus) {
        this.usul_hapus = usul_hapus;
    }
    
    public Long getSisa_umur() {
        return sisa_umur;
    }

    public void setSisa_umur(Long sisa_umur) {
        this.sisa_umur = sisa_umur;
    }

    public String getSakti() {
        return sakti;
    }

    public void setSakti(String sakti) {
        this.sakti = sakti;
    }

    public String getKode_registrasi_sakti() {
        return kode_registrasi_sakti;
    }

    public void setKode_registrasi_sakti(String kode_registrasi_sakti) {
        this.kode_registrasi_sakti = kode_registrasi_sakti;
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
