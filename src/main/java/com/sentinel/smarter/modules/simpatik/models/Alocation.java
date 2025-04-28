package com.sentinel.smarter.modules.simpatik.models;

import jakarta.persistence.*; 

@Entity @Table(name="tbl_alokasi")
public class Alocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String ID_PERUSAHAAN;
    private Long ID_SATUAN_KERJA;
    private Long ID_BARANG;
    private String NUP;
    private Long ID_KONDISI_BARANG;

    private Long ID_JENIS_DOKUMEN;
    private Long ID_KEPEMILIKAN;
    private Long ID_JENIS_SERTIFIKAT;
    private String MERK;
    private String TIPE;

    private String TGL_PEROLEHAN;
    private String TGL_AWAL_PAKAI;
    private long NILAI_PEROLEHAN_PERTAMA;
    private long NILAI_MUTASI;
    private long NILAI_PEROLEHAN;

    private long NILAI_PENYUSUTAN;
    private long NILAI_BUKU;
    private Long ID_SATUAN;
    private Double KUANTITAS;
    private Double LUAS_TANAH_KESELURUHAN;

    private Double LUAS_TANAH_UNTUK_BANGUNAN;
    private Double LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN;
    private Double LUAS_LAHAN_KOSONG;
    private Double LUAS_BANGUNAN;
    private Double LUAS_DASAR_BANGUNAN;

    private Long LANTAI;
    private Long ID_STATUS_GUNA;
    private String NO_PSP;
    private String TGL_PSP;
    private String NO_BPKB;

    private String NO_POLISI;
    private String PEMAKAI;
    private String ALAMAT;
    private String RT_RW;
    private String KELURAHAN;

    private String KECAMATAN;
    private String KODE_KABUPATEN_KOTA;
    private String KABUPATEN_KOTA;
    private String KODE_PROVINSI;
    private String PROVINSI;

    private String KODE_POS;
    private String ALAMAT_LAIN;
    private Long KIB;
    private Double SBSK;
    private Double OPTIMALISASI;

    private Long ID_STATUS_SBSN;
    private String NO_TIKET_USUL_PSP;
    private String INTRA_EKSTRA;
    private String BPYBDS;
    private String HENTI_GUNA;

    private String KEMITRAAN;
    private String HILANG;
    private String DKTP;
    private String USUL_RUSAK_BERAT;
    private String USUL_HAPUS;

    private Long SISA_UMUR;
    private String SAKTI;
    private String KODE_REGISTRASI_SAKTI;
    private String FOTO;
    private Long ID_PENGGUNA;

    public Alocation() {
  
    }

    public Alocation(
        String ID_PERUSAHAAN, Long ID_SATUAN_KERJA, Long ID_BARANG, String NUP, Long ID_KONDISI_BARANG,
        Long ID_JENIS_DOKUMEN, Long ID_KEPEMILIKAN, Long ID_JENIS_SERTIFIKAT, String MERK, String TIPE,
        String TGL_PEROLEHAN, String TGL_AWAL_PAKAI, long NILAI_PEROLEHAN_PERTAMA, long NILAI_MUTASI, long NILAI_PEROLEHAN,
        long NILAI_PENYUSUTAN, long NILAI_BUKU, Long ID_SATUAN, Double KUANTITAS, Double LUAS_TANAH_KESELURUHAN,
        Double LUAS_TANAH_UNTUK_BANGUNAN, Double LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN, Double LUAS_LAHAN_KOSONG, Double LUAS_BANGUNAN, Double LUAS_DASAR_BANGUNAN,
        Long LANTAI, Long ID_STATUS_GUNA, String NO_PSP, String TGL_PSP, String NO_BPKB,
        String NO_POLISI, String PEMAKAI, String ALAMAT, String RT_RW, String KELURAHAN,
        String KECAMATAN, String KODE_KABUPATEN_KOTA, String KABUPATEN_KOTA, String KODE_PROVINSI, String PROVINSI,
        String KODE_POS, String ALAMAT_LAIN, Long KIB, Double SBSK, Double OPTIMALISASI,
        Long ID_STATUS_SBSN, String NO_TIKET_USUL_PSP, String INTRA_EKSTRA, String BPYBDS, String HENTI_GUNA,
        String KEMITRAAN, String HILANG, String DKTP, String USUL_RUSAK_BERAT, String USUL_HAPUS,
        Long SISA_UMUR, String SAKTI, String KODE_REGISTRASI_SAKTI, String FOTO, Long ID_PENGGUNA) {

            this.ID_PERUSAHAAN = ID_PERUSAHAAN;
            this.ID_SATUAN_KERJA = ID_SATUAN_KERJA;
            this.ID_BARANG = ID_BARANG;
            this.NUP = NUP;
            this.ID_KONDISI_BARANG = ID_KONDISI_BARANG;

            this.ID_JENIS_DOKUMEN = ID_JENIS_DOKUMEN;
            this.ID_KEPEMILIKAN = ID_KEPEMILIKAN;
            this.ID_JENIS_SERTIFIKAT = ID_JENIS_SERTIFIKAT;
            this.MERK = MERK;
            this.TIPE = TIPE;

            this.TGL_PEROLEHAN = TGL_PEROLEHAN;
            this.TGL_AWAL_PAKAI = TGL_AWAL_PAKAI;
            this.NILAI_PEROLEHAN_PERTAMA = NILAI_PEROLEHAN_PERTAMA;
            this.NILAI_MUTASI = NILAI_MUTASI;
            this.NILAI_PEROLEHAN = NILAI_PEROLEHAN;

            this.NILAI_PENYUSUTAN = NILAI_PENYUSUTAN;
            this.NILAI_BUKU = NILAI_BUKU;
            this.ID_SATUAN = ID_SATUAN;
            this.KUANTITAS = KUANTITAS;
            this.LUAS_TANAH_KESELURUHAN = LUAS_TANAH_KESELURUHAN;

            this.LUAS_TANAH_UNTUK_BANGUNAN = LUAS_TANAH_UNTUK_BANGUNAN;
            this.LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN = LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN;
            this.LUAS_LAHAN_KOSONG = LUAS_LAHAN_KOSONG;
            this.LUAS_BANGUNAN = LUAS_BANGUNAN;
            this.LUAS_DASAR_BANGUNAN = LUAS_DASAR_BANGUNAN;

            this.LANTAI = LANTAI;
            this.ID_STATUS_GUNA = ID_STATUS_GUNA;
            this.NO_PSP = NO_PSP;
            this.TGL_PSP = TGL_PSP;
            this.NO_BPKB = NO_BPKB;

            this.NO_POLISI = NO_POLISI;
            this.PEMAKAI = PEMAKAI;
            this.ALAMAT = ALAMAT;
            this.RT_RW = RT_RW;
            this.KELURAHAN = KELURAHAN;

            this.KECAMATAN = KECAMATAN;
            this.KODE_KABUPATEN_KOTA = KODE_KABUPATEN_KOTA;
            this.KABUPATEN_KOTA = KABUPATEN_KOTA;
            this.KODE_PROVINSI = KODE_PROVINSI;
            this.PROVINSI = PROVINSI;

            this.KODE_POS = KODE_POS;
            this.ALAMAT_LAIN = ALAMAT_LAIN;
            this.KIB = KIB;
            this.SBSK = SBSK;
            this.OPTIMALISASI = OPTIMALISASI;

            this.ID_STATUS_SBSN = ID_STATUS_SBSN;
            this.NO_TIKET_USUL_PSP = NO_TIKET_USUL_PSP;
            this.INTRA_EKSTRA = INTRA_EKSTRA;
            this.BPYBDS = BPYBDS;
            this.HENTI_GUNA = HENTI_GUNA;

            this.KEMITRAAN = KEMITRAAN;
            this.HILANG = HILANG;
            this.DKTP = DKTP;
            this.USUL_RUSAK_BERAT = USUL_RUSAK_BERAT;
            this.USUL_HAPUS = USUL_HAPUS;

            this.SISA_UMUR = SISA_UMUR;
            this.SAKTI = SAKTI;
            this.KODE_REGISTRASI_SAKTI = KODE_REGISTRASI_SAKTI;
            this.FOTO = FOTO;
            this.ID_PENGGUNA = ID_PENGGUNA;
    } 

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getID_perusahaan() {
        return ID_PERUSAHAAN;
    }

    public void setID_perusahaan(String id_perusahaan) {
        this.ID_PERUSAHAAN = id_perusahaan;
    }

    public Long getID_satuan_kerja() {
        return ID_SATUAN_KERJA;
    }

    public void setID_satuan_kerja(Long id_satuan_kerja) {
        this.ID_SATUAN_KERJA = id_satuan_kerja;
    }

    public Long getID_barang() {
        return ID_BARANG;
    }

    public void setID_barang(Long id_barang) {
        this.ID_BARANG = id_barang;
    }

    public String getNup() {
        return NUP;
    }

    public void setNup(String nup) {
        this.NUP = nup;
    }

    public Long getID_kondisi_barang() {
        return ID_KONDISI_BARANG;
    }

    public void setID_kondisi_barang(Long id_kondisi_barang) {
        this.ID_KONDISI_BARANG = id_kondisi_barang;
    }




    public Long getID_jenis_dokumen() {
        return ID_JENIS_DOKUMEN;
    }

    public void setID_jenis_dokumen(Long id_jenis_dokumen) {
        this.ID_JENIS_DOKUMEN = id_jenis_dokumen;
    }

    public Long getID_kepemilikan() {
        return ID_KEPEMILIKAN;
    }

    public void setID_kepemilikan(Long id_kepemilikan) {
        this.ID_KEPEMILIKAN = id_kepemilikan;
    }

    public Long getID_jenis_sertifikat() {
        return ID_JENIS_SERTIFIKAT;
    }

    public void setID_jenis_sertifikat(Long id_jenis_sertifikat) {
        this.ID_JENIS_SERTIFIKAT = id_jenis_sertifikat;
    }

    public String getMerk() {
        return MERK;
    }

    public void setMerk(String merk) {
        this.MERK = merk;
    }

    public String getTipe() {
        return TIPE;
    }

    public void setTipe(String tipe) {
        this.TIPE = tipe;
    }





    public String getTgl_perolehan() {
        return TGL_PEROLEHAN;
    }

    public void setTgl_perolehan(String tgl_perolehan) {
        this.TGL_PEROLEHAN = tgl_perolehan;
    }

    public String getTgl_awal_pakai() {
        return TGL_AWAL_PAKAI;
    }

    public void setTgl_awal_pakai(String tgl_awal_pakai) {
        this.TGL_AWAL_PAKAI = tgl_awal_pakai;
    }

    public long getNilai_perolehan_pertama() {
        return NILAI_PEROLEHAN_PERTAMA;
    }

    public void setNilai_perolehan_pertama(long nilai_perolehan_pertama) {
        this.NILAI_PEROLEHAN_PERTAMA = nilai_perolehan_pertama;
    }

    public long getNilai_mutasi() {
        return NILAI_MUTASI;
    }

    public void setNilai_mutasi(long nilai_mutasi) {
        this.NILAI_MUTASI = nilai_mutasi;
    }

    public long getNilai_perolehan() {
        return NILAI_PEROLEHAN;
    }

    public void setNilai_perolehan(long nilai_perolehan) {
        this.NILAI_PEROLEHAN = nilai_perolehan;
    }




    public long getNilai_penyusutan() {
        return NILAI_PENYUSUTAN;
    }

    public void setNilai_penyusutan(long nilai_penyusutan) {
        this.NILAI_PENYUSUTAN = nilai_penyusutan;
    }

    public long getNilai_buku() {
        return NILAI_BUKU;
    }

    public void setNilai_buku(long nilai_buku) {
        this.NILAI_BUKU = nilai_buku;
    }

    public Long getID_satuan() {
        return ID_SATUAN;
    }

    public void setID_satuan(Long id_satuan) {
        this.ID_SATUAN = id_satuan;
    }

    public Double getKuantitas() {
        return KUANTITAS;
    }

    public void setKuantitas(Double kuantitas) {
        this.KUANTITAS = kuantitas;
    }

    public Double getLuas_tanah_keseluruhan() {
        return LUAS_TANAH_KESELURUHAN;
    }

    public void setLuas_tanah_keseluruhan(Double luas_tanah_keseluruhan) {
        this.LUAS_TANAH_KESELURUHAN = luas_tanah_keseluruhan;
    }

    public Double getLuas_tanah_untuk_bangunan() {
        return LUAS_TANAH_UNTUK_BANGUNAN;
    }

    public void setLuas_tanah_untuk_bangunan(Double luas_tanah_untuk_bangunan) {
        this.LUAS_TANAH_UNTUK_BANGUNAN = luas_tanah_untuk_bangunan;
    }

    public Double getLuas_tanah_untuk_sarana_lingkungan() {
        return LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN;
    }

    public void setLuas_tanah_untuk_sarana_lingkungan(Double luas_tanah_untuk_sarana_lingkungan) {
        this.LUAS_TANAH_UNTUK_SARANA_LINGKUNGAN = luas_tanah_untuk_sarana_lingkungan;
    }

    public Double getLuas_lahan_kosong() {
        return LUAS_LAHAN_KOSONG;
    }

    public void setLuas_lahan_kosong(Double luas_lahan_kosong) {
        this.LUAS_LAHAN_KOSONG = luas_lahan_kosong;
    }

    public Double getLuas_bangunan() {
        return LUAS_BANGUNAN;
    }

    public void setLuas_bangunan(Double luas_bangunan) {
        this.LUAS_BANGUNAN = luas_bangunan;
    }

    public Double getLuas_dasar_bangunan() {
        return LUAS_DASAR_BANGUNAN;
    }

    public void setLuas_dasar_bangunan(Double luas_dasar_bangunan) {
        this.LUAS_DASAR_BANGUNAN = luas_dasar_bangunan;
    }

    public Long getLantai() {
        return LANTAI;
    }

    public void setLantai(Long lantai) {
        this.LANTAI = lantai;
    }

    public Long getID_status_guna() {
        return ID_STATUS_GUNA;
    }

    public void setID_status_guna(Long id_status_guna) {
        this.ID_STATUS_GUNA = id_status_guna;
    }

    public String getNo_psp() {
        return NO_PSP;
    }

    public void setNo_psp(String no_psp) {
        this.NO_PSP = no_psp;
    }

    public String getTgl_psp() {
        return TGL_PSP;
    }

    public void setTgl_psp(String tgl_psp) {
        this.TGL_PSP = tgl_psp;
    }

    public String getNo_bpkb() {
        return NO_BPKB;
    }

    public void setNo_bpkb(String no_bpkb) {
        this.NO_BPKB = no_bpkb;
    }

    public String getNo_polisi() {
        return NO_POLISI;
    }

    public void setNo_polisi(String no_polisi) {
        this.NO_POLISI = no_polisi;
    }

    public String getPemakai() {
        return PEMAKAI;
    }

    public void setPemakai(String pemakai) {
        this.PEMAKAI = pemakai;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String alamat) {
        this.ALAMAT = alamat;
    }

    public String getRt_rw() {
        return RT_RW;
    }

    public void setRt_rw(String rt_rw) {
        this.RT_RW = rt_rw;
    }

    public String getKelurahan() {
        return KELURAHAN;
    }

    public void setKelurahan(String kelurahan) {
        this.KELURAHAN = kelurahan;
    }

    public String getKecamatan() {
        return KECAMATAN;
    }

    public void setKecamatan(String kecamatan) {
        this.KECAMATAN = kecamatan;
    }

    public String getKode_kabupaten_kota() {
        return KODE_KABUPATEN_KOTA;
    }

    public void setKode_kabupaten_kota(String kode_kabupaten_kota) {
        this.KODE_KABUPATEN_KOTA = kode_kabupaten_kota;
    }

    public String getKabupaten_kota() {
        return KABUPATEN_KOTA;
    }

    public void setKabupaten_kota(String kabupaten_kota) {
        this.KABUPATEN_KOTA = kabupaten_kota;
    }

    public String getKode_provinsi() {
        return KODE_PROVINSI;
    }

    public void setKode_provinsi(String kode_provinsi) {
        this.KODE_PROVINSI = kode_provinsi;
    }

    public String getProvinsi() {
        return PROVINSI;
    }

    public void setProvinsi(String provinsi) {
        this.PROVINSI = provinsi;
    }

    public String getKode_pos() {
        return KODE_POS;
    }

    public void setKode_pos(String kode_pos) {
        this.KODE_POS = kode_pos;
    }

    public String getAlamat_lain() {
        return ALAMAT_LAIN;
    }

    public void setAlamat_lain(String alamat_lain) {
        this.ALAMAT_LAIN = alamat_lain;
    }

    public Long getKib() {
        return KIB;
    }

    public void setKib(Long kib) {
        this.KIB = kib;
    }

    public Double getSbsk() {
        return SBSK;
    }

    public void setSbsk(Double sbsk) {
        this.SBSK = sbsk;
    }

    public Double getOptimalisasi() {
        return OPTIMALISASI;
    }

    public void setOptimalisasi(Double optimalisasi) {
        this.OPTIMALISASI = optimalisasi;
    }

    public Long getID_status_sbsn() {
        return ID_STATUS_SBSN;
    }

    public void setID_status_sbsn(Long id_status_sbsn) {
        this.ID_STATUS_SBSN = id_status_sbsn;
    }

    public String getNo_tiket_usul_psp() {
        return NO_TIKET_USUL_PSP;
    }

    public void setNo_tiket_usul_psp(String no_tiket_usul_psp) {
        this.NO_TIKET_USUL_PSP = no_tiket_usul_psp;
    }

    public String getIntra_ekstra() {
        return INTRA_EKSTRA;
    }

    public void setIntra_ekstra(String intra_ekstra) {
        this.INTRA_EKSTRA = intra_ekstra;
    }

    public String getBpybds() {
        return BPYBDS;
    }

    public void setBpybds(String bpybds) {
        this.BPYBDS = bpybds;
    }

    public String getHenti_guna() {
        return HENTI_GUNA;
    }

    public void setHenti_guna(String henti_guna) {
        this.HENTI_GUNA = henti_guna;
    }

    public String getKemitraan() {
        return KEMITRAAN;
    }

    public void setKemitraan(String kemitraan) {
        this.KEMITRAAN = kemitraan;
    }

    public String getHilang() {
        return HILANG;
    }

    public void setHilang(String hilang) {
        this.HILANG = hilang;
    }

    public String getUDktp() {
        return DKTP;
    }

    public void setDktp(String dktp) {
        this.DKTP = dktp;
    }

    public String getUsul_rusak_berat() {
        return USUL_RUSAK_BERAT;
    }

    public void setUsul_rusak_berat(String usul_rusak_berat) {
        this.USUL_RUSAK_BERAT = usul_rusak_berat;
    }

    public String getUsul_hapus() {
        return USUL_HAPUS;
    }

    public void setUsul_hapus(String usul_hapus) {
        this.USUL_HAPUS = usul_hapus;
    }

    public Long getSisa_umur() {
        return SISA_UMUR;
    }

    public void setSisa_umur(Long sisa_umur) {
        this.SISA_UMUR = sisa_umur;
    }

    public String getSakti() {
        return SAKTI;
    }

    public void setSakti(String sakti) {
        this.SAKTI = sakti;
    }

    public String getKode_registrasi_sakti() {
        return KODE_REGISTRASI_SAKTI;
    }

    public void setKode_registrasi_sakti(String kode_registrasi_sakti) {
        this.KODE_REGISTRASI_SAKTI = kode_registrasi_sakti;
    }

    public String getFoto() {
        return FOTO;
    }

    public void setFoto(String foto) {
        this.FOTO = foto;
    }

    public Long getID_pengguna() {
        return ID_PENGGUNA;
    }

    public void setID_pengguna(Long id_pengguna) {
        this.ID_PENGGUNA = id_pengguna;
    }
}
