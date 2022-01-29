package br.com.neki.teste.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer idUsuario;
	
	@Column(unique=true)
	private String login;
	
	@Column(name="password")
	private String senha;
	
	@Column(name="last_login_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataUltimoLogin;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setPassword(String password) {
		senha = senha;
	}

	public LocalDate getDataUltimoLogin() {
		return dataUltimoLogin;
	}

	public void setDataUltimoLogin(LocalDate dataUltimoLogin) {
		dataUltimoLogin = dataUltimoLogin;
	}

	public Usuario(Integer idUsuario, String login, String senha, LocalDate dataUltimoLogin) {
		super();
		idUsuario = idUsuario;
		login = login;
		senha = senha;
		dataUltimoLogin = dataUltimoLogin;
	}

	public Usuario() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataUltimoLogin, idUsuario, login, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dataUltimoLogin, other.dataUltimoLogin) && Objects.equals(idUsuario, other.idUsuario)
				&& Objects.equals(login, other.login) && Objects.equals(senha, other.senha);
	}

	

	
}
