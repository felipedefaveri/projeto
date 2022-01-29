package br.com.neki.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.exception.NotFoundException;
import br.com.neki.teste.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarTodas(){
		if (usuarioRepository.findAll() == null) {
			throw new NotFoundException("Não encontrado.");
		}
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> listarPorId(Long id){
		usuarioRepository.findById(id);
		if (usuarioRepository.findById(id) == null) {
			throw new NotFoundException("Habilidade não encontrada.");
		}
		return usuarioRepository.findById(id);
	}
	
	public Usuario inserir(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
}