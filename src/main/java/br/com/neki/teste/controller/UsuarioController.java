package br.com.neki.teste.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.dto.UsuarioDTO;
import br.com.neki.teste.dto.UsuarioLoginDTO;
import br.com.neki.teste.repository.UsuarioRepository;
import br.com.neki.teste.service.UsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	UsuarioService usuarioService;
	
	PasswordEncoder encoder;
	
	public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder encoder) {
		super();
		this.usuarioRepository = usuarioRepository;
		this.encoder = encoder;
	}

//	@GetMapping("/listarTodos")
//	public ResponseEntity<List<Usuario>> listarTodos(){
//		return ResponseEntity.ok(usuarioService.buscarTodos());
//	}
////	
////	@GetMapping("/{login}")
////	public ResponseEntity<Usuario> listarTudo(@PathVariable S id) {
////		Optional<Usuario> usuario = usuarioRepository.findByLogin(id);
////		if(usuario.isPresent()) {
////			return ResponseEntity.ok(usuario.get());
////		}
////		return ResponseEntity.notFound().build();
////	}
//	@PostMapping("/salvar")
//	@ResponseStatus(HttpStatus.CREATED)
//	public UsuarioDTO inserir( @RequestBody @Valid UsuarioDTO usuario) {
//		usuario.setSenha(encoder.encode(usuario.getSenha()));
//		return usuarioService.criar(usuario);
//		
//	}
//	@GetMapping("/validarSenha")
//	public ResponseEntity<Boolean> validarSenha( @RequestParam String login, @RequestParam String senha){
//		
//		Optional<UsuarioLoginDTO> optUsuario = usuarioService.buscarPorLogin(login);
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

