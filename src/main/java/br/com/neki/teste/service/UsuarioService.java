package br.com.neki.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.dto.UsuarioDTO;
import br.com.neki.teste.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	 public Usuario criar(Usuario user){
	        return usuarioRepository.save(user);
}
	 public Optional<UsuarioDTO> buscarPorLogin(String login){
	        return usuarioRepository.findByLogin(login);
}
}