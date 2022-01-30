package br.com.neki.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import br.com.neki.teste.domain.SkillUsuario;

public interface SkillUsuarioRepository extends JpaRepository<SkillUsuario, Long>{


}
