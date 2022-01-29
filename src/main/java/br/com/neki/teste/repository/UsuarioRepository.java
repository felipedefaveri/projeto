package br.com.neki.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.neki.teste.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query(value = "select * from usuario", nativeQuery = true)
	public List<Usuario> listarUsuarios();
	
} 


//@Query(value="select login from usuario;", nativeQuery=true)
//Optional<UsuarioDTO> findByLogin(String login);
//
//Usuario save(String usuario);