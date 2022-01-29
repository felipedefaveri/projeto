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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer IdSkill;
	
	@Column(name="name")
	private String Nome;
	
	@Column(name="version")
	private String Versao;
	
	@Column(name="description")
	private String Descricao;
	
	@Column(name="image_url")
	private String Imagem;

	public Integer getIdSkill() {
		return IdSkill;
	}

	public void setIdSkill(Integer idSkill) {
		IdSkill = idSkill;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getVersao() {
		return Versao;
	}

	public void setVersao(String versao) {
		Versao = versao;
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

	public Skill(Integer idSkill, String nome, String versao, String descricao, String imagem) {
		super();
		IdSkill = idSkill;
		Nome = nome;
		Versao = versao;
		Descricao = descricao;
		Imagem = imagem;
	}
	
	
	public Skill() {
		super();
	}
	

}