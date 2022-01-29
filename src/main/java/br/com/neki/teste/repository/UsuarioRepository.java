package br.com.neki.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.neki.teste.domain.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	public Optional<Usuario> findById(Integer id);
	
	@Query(value="select login from teste_residencia.usuario;", nativeQuery=true)
	public Optional<Usuario> findByLogin(String Login);
} 
