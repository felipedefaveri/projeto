package br.com.neki.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.repository.UsuarioRepository;




@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

}
