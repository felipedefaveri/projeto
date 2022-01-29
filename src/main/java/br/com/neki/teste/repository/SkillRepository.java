package br.com.neki.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.neki.teste.domain.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer>{

	@Query(value = "select * from skill", nativeQuery = true)
	public List<Skill> listarSkills();
	
}
