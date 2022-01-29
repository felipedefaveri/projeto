package br.com.neki.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.dto.UsuarioDTO;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query(value="select login from usuario;", nativeQuery=true)
	Optional<UsuarioDTO> findByLogin(String login);

	Usuario save(String usuario);
	
	
} 
