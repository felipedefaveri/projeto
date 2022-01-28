package br.com.neki.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.teste.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findById(Long id);
	
//	public Optional<Usuario> findByLogin(String login);

}
