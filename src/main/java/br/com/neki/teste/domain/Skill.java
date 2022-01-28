package br.com.neki.teste.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long IdSkill;
	
	@Column(name="name")
	private String Nome;
	
	@Column(name="version")
	private String Versão;
	
	@Column(name="description")
	private String Descricao;
	
	@Column(name="image_url")
	private String Imagem;

	public Long getIdSkill() {
		return IdSkill;
	}

	public void setIdSkill(Long idSkill) {
		IdSkill = idSkill;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getVersão() {
		return Versão;
	}

	public void setVersão(String versão) {
		Versão = versão;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getImagem() {
		return Imagem;
	}

	public void setImagem(String imagem) {
		Imagem = imagem;
	}

	public Skill(Long idSkill, String nome, String versão, String descricao, String imagem) {
		super();
		IdSkill = idSkill;
		Nome = nome;
		Versão = versão;
		Descricao = descricao;
		Imagem = imagem;
	}

	public Skill() {
		super();
	}
	
	

	}