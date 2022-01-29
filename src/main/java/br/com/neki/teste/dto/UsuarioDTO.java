package br.com.neki.teste.dto;

import java.time.LocalDate;

public class UsuarioDTO {
	
	public Integer id;
	public String login;
	public String senha;
	public LocalDate ultimaDataLogin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public LocalDate getUltimaDataLogin() {
		return ultimaDataLogin;
	}
	public void setUltimaDataLogin(LocalDate ultimaDataLogin) {
		this.ultimaDataLogin = ultimaDataLogin;
	}
	public UsuarioDTO() {
		super();
	}
	
	
}
