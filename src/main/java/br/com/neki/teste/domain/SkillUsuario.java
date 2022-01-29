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
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="user_skill")
public class SkillUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Usuario Usuario;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill Skill;
	
	@Column(name="knowledge_level")
	private Long NivelConhecimento;
	
	@Column(name="created_at")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate CreatedAt;
	
	@Column(name="updated_at")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate UpdatedAt;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.Usuario = usuario;
	}

	public Skill getSkill() {
		return Skill;
	}

	public void setSkill(Skill skill) {
		this.Skill = skill;
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

	public LocalDate getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdateAt(LocalDate updatedAt) {
		UpdatedAt = updatedAt;
	}

	public SkillUsuario(Long id, Usuario usuario, Skill skill, Long nivelConhecimento, LocalDate createdAt,
			LocalDate updatedAt) {
		super();
		Id = id;
		this.Usuario = usuario;
		this.Skill = skill;
		NivelConhecimento = nivelConhecimento;
		CreatedAt = createdAt;
		UpdatedAt = updatedAt;
	}

	public SkillUsuario() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(CreatedAt, Id, NivelConhecimento, UpdatedAt);
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
				&& Objects.equals(UpdatedAt, other.UpdatedAt);
	}

	
}
