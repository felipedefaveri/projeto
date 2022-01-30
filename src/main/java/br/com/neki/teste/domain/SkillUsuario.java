package br.com.neki.teste.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class SkillUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@Column(name="knowledge_level")
	private Long NivelConhecimento;
	
	@Column
	private LocalDate CreatedAt;
	
	@Column
	private LocalDate UpdateAt;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Long getNivelConhecimento() {
		return NivelConhecimento;
	}

	public void setNivelConhecimento(Long nivelConhecimento) {
		NivelConhecimento = nivelConhecimento;
	}

	public LocalDate getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		CreatedAt = createdAt;
	}

	public LocalDate getUpdateAt() {
		return UpdateAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		UpdateAt = updateAt;
	}

	public SkillUsuario(Long id, Usuario usuario, Skill skill, Long nivelConhecimento, LocalDate createdAt,
			LocalDate updateAt) {
		super();
		Id = id;
		this.usuario = usuario;
		this.skill = skill;
		NivelConhecimento = nivelConhecimento;
		CreatedAt = createdAt;
		UpdateAt = updateAt;
	}

	public SkillUsuario() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(CreatedAt, Id, NivelConhecimento, UpdateAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillUsuario other = (SkillUsuario) obj;
		return Objects.equals(CreatedAt, other.CreatedAt) && Objects.equals(Id, other.Id)
				&& Objects.equals(NivelConhecimento, other.NivelConhecimento)
				&& Objects.equals(UpdateAt, other.UpdateAt);
	}

	
}
