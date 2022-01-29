package br.com.neki.teste.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.service.UsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	PasswordEncoder encoder;

	@GetMapping("/listarTudo")
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> usuarios = usuarioService.listarTodas();
		return ResponseEntity.ok(usuarios);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Usuario>> buscarPorId(@PathVariable Integer id) {
		Optional<Usuario> usuarios = usuarioService.listarPorId(id);
		return ResponseEntity.ok().body(usuarios);
	}

//	@PostMapping("/inserir")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Usuario inserir( @RequestBody @Valid  Usuario usuario) { 	
//		usuario.setSenha(encoder.encode(usuario.getSenha()));
//
//        return usuarioService.inserir(usuario);
//    }

	@PostMapping("/inserir")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario inserirHabilidade(@RequestBody @Valid Usuario usuario) {
		return usuarioService.inserir(usuario);
	}

	@PutMapping("/atualizar")
	public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.atualizar(usuario);
	}

	@DeleteMapping("/deletar")
	public void deletarUsuario(@RequestBody Usuario usuario) {
		usuarioService.deletar(usuario);
	}

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
