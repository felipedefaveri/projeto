package br.com.neki.teste.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private Integer IdUsuario;
	
	@Column(name="login")
	private String Login;
	
	@Column(name="password")
	private String Password;
	
	@Column(name="last_login_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate DataUltimoLogin;

	public Integer getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		IdUsuario = idUsuario;
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

	public Usuario(Integer idUsuario, String login, String password, LocalDate dataUltimoLogin) {
		super();
		IdUsuario = idUsuario;
		Login = login;
		Password = password;
		DataUltimoLogin = dataUltimoLogin;
	}

	public Usuario() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(DataUltimoLogin, IdUsuario, Login, Password);
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
		return Objects.equals(DataUltimoLogin, other.DataUltimoLogin) && Objects.equals(IdUsuario, other.IdUsuario)
				&& Objects.equals(Login, other.Login) && Objects.equals(Password, other.Password);
	}
	
}
