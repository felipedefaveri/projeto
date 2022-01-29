package br.com.neki.teste.dto;

import java.time.LocalDate;

public class UsuarioDTO {
	
	public Long Id;
	public String Login;
	public String Password;
	public LocalDate DataUltimoLogin;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDate getDataUltimoLogin() {
		return DataUltimoLogin;
	}
	public void setDataUltimoLogin(LocalDate dataUltimoLogin) {
		DataUltimoLogin = dataUltimoLogin;
	}
	public UsuarioDTO(Long id, String login, String password, LocalDate dataUltimoLogin) {
		super();
		Id = id;
		Login = login;
		Password = password;
		DataUltimoLogin = dataUltimoLogin;
	}
	public UsuarioDTO() {
		super();
	}
	
	
}
