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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	
	
	private final PasswordEncoder encoder;
	
	public UsuarioController(UsuarioRepository usuarioRepository, PasswordEncoder encoder) {
		super();
		this.usuarioRepository = usuarioRepository;
		this.encoder = encoder;
	}

	@GetMapping("/listarTodos")
	public ResponseEntity<List<Usuario>> listarTodos(){
		
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> listarTudo(@PathVariable Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if(usuario.isPresent()) {
			return ResponseEntity.ok(usuario.get());
		}
		return ResponseEntity.notFound().build();
	}
//	@GetMapping("/{login}")
//	public ResponseEntity<Usuario> listarTudo(@PathVariable S id) {
//		Optional<Usuario> usuario = usuarioRepository.findByLogin(id);
//		if(usuario.isPresent()) {
//			return ResponseEntity.ok(usuario.get());
//		}
//		return ResponseEntity.notFound().build();
//	}
	@PostMapping("/salvar")
	public Usuario inserir( @RequestBody Usuario usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return usuarioRepository.save(usuario);
		
	}
//	@GetMapping("/validarSenha")
//	public ResponseEntity<Boolean> validarSenha(@RequestParam String login, @RequestParam String password){
//		
//		Optional<Usuario> optUsuario = usuarioRepository.findByLogin(login);
//		if (optUsuario.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
//		}
//		
//		Usuario usuario = optUsuario.get();
//		boolean valid = encoder.matches(password, usuario.getPassword());
//		
//		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
//		return ResponseEntity.status(status).body(valid);	}
//}
}
