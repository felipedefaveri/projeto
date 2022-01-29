package br.com.neki.teste.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.dto.UsuarioDTO;
import br.com.neki.teste.repository.UsuarioRepository;
import br.com.neki.teste.service.UsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	BCryptPasswordEncoder encoder;
	

	@GetMapping("/listarTodos")
	public ResponseEntity<List<Usuario>> obterTodos() {
		List<Usuario> usuarios = usuarioService.buscarTodos();
		return ResponseEntity.ok(usuarios);
	}
	
	@GetMapping("/{login}")
	public ResponseEntity<?> listarTudo(@PathVariable String login) {
		Optional<UsuarioDTO> usuario = usuarioService.buscarPorLogin(login);
		if(usuario.isPresent()) {
			return ResponseEntity.ok(usuario.get().getLogin());
		}
		return ResponseEntity.notFound().build();
	}
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario inserir( @RequestBody @Valid  Usuario usuario) {
		return usuarioService.criar(usuario);
		
		
	}
//	@GetMapping("/validarSenha")
//	public ResponseEntity<Boolean> validarSenha( @RequestParam String login, @RequestParam String senha){
//		
//		Optional<UsuarioLoginDTO> optUsuario = usuarioRepository.findByLogin(login);
//		if (optUsuario.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
//		}
//		
//		UsuarioLoginDTO user = optUsuario.get();
//		boolean valid = encoder.matches(senha, user.getSenha());
//		
//		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
//		return ResponseEntity.status(status).body(valid);	}
}

