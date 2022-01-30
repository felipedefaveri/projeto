package br.com.neki.teste.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.SkillUsuario;
import br.com.neki.teste.repository.SkillUsuarioRepository;


@RestController
@RequestMapping("/usuarioSkill")
public class SkillUsuarioController {
	@Autowired
	SkillUsuarioRepository skillUsuarioRepository;
	
	@GetMapping("/listarTudo")
	public ResponseEntity<List<SkillUsuario>> listar(){
		List<SkillUsuario> skillUsuarios = skillUsuarioRepository.findAll();
		return ResponseEntity.ok(skillUsuarios);
	}
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<Optional<SkillUsuario>> buscarPorId(@PathVariable Long id) {
        Optional<SkillUsuario> skill = skillUsuarioRepository.findById(id);
        return ResponseEntity.ok().body(skill);
    }
	
	@PostMapping("/inserir")
    @ResponseStatus(HttpStatus.CREATED)
    public SkillUsuario inserirHabilidade( @RequestBody @Valid  SkillUsuario skillUsuario) {
        return skillUsuarioRepository.save(skillUsuario);
    }
	
	 @PutMapping("/{id}")
	 public SkillUsuario atualizarHabilidade(@RequestBody SkillUsuario skillUsuario) {
		 return skillUsuarioRepository.saveAndFlush(skillUsuario);
	 }
	
	
	@DeleteMapping("/{id}")
public void deletarHabilidade(@PathVariable Long id) {
		skillUsuarioRepository.deleteById(id);
	}
}
