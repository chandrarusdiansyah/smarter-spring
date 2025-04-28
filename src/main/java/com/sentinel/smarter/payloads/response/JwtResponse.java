package com.sentinel.smarter.payloads.response;

import java.util.List;

public class JwtResponse {

    private Long id;
	private String username;
	
	private String type = "Bearer";
    private String token;
	
	private Long id_aplikasi;
	private Long id_jenis_pengguna;
	private Long id_pegawai;
	private String nip_pegawai;
	private String nama_pegawai;
	private String foto_pegawai;
	private String tautan;

	private List<String> roles;

    public JwtResponse(Long id, String username, String token, Long id_aplikasi, Long id_jenis_pengguna, Long id_pegawai, String nip_pegawai, String nama_pegawai, String foto_pegawai, String tautan, List<String> roles) {
        
		this.id = id;
		this.username = username;
		
		this.token = token;

		this.id_aplikasi = id_aplikasi;
		this.id_jenis_pengguna = id_jenis_pengguna;
		this.id_pegawai = id_pegawai;
		this.nip_pegawai = nip_pegawai;
		this.nama_pegawai = nama_pegawai;
		this.foto_pegawai = foto_pegawai;
		this.tautan = tautan;

		this.roles = roles;
	}
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getID_aplikasi() {
		return id_aplikasi;
	}

	public void setID_aplikasi(Long id_aplikasi) {
		this.id_aplikasi = id_aplikasi;
	}

    public Long getID_jenis_pengguna() {
		return id_jenis_pengguna;
	}

	public void setID_jenis_pengguna(Long id_jenis_pengguna) {
		this.id = id_jenis_pengguna;
	}

	public Long getID_pegawai() {
		return id_pegawai;
	}

	public void setID_pegawai(Long id_pegawai) {
		this.id_pegawai = id_pegawai;
	}

    public String getNip_pegawai() {
		return nip_pegawai;
	}

	public void setNip_pegawai(String nip_pegawai) {
		this.nip_pegawai = nip_pegawai;
	}

    public String getNama_pegawai() {
		return nama_pegawai;
	}

	public void setNama_pegawai(String nama_pegawai) {
		this.nama_pegawai = nama_pegawai;
	}

    public String getFoto_pegawai() {
		return foto_pegawai;
	}

	public void setFoto_pegawai(String foto_pegawai) {
		this.foto_pegawai = foto_pegawai;
	}

	public String getTautan() {
		return tautan;
	}

	public void setTautan(String tautan) {
		this.tautan = tautan;
	}

	public List<String> getRoles() {
		return roles;
	}
}

