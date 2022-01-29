package br.com.neki.teste.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.neki.teste.domain.Skill;
import br.com.neki.teste.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {

	@Autowired
	SkillService skillService;
	
	@GetMapping("/listarTudo")
	public ResponseEntity<List<Skill>> listar(){
		List<Skill> skills = skillService.listarTodas();
		return ResponseEntity.ok(skills);
	}
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Skill>> buscarPorId(@PathVariable Integer id) {
        Optional<Skill> skill = skillService.listarPorId(id);
        return ResponseEntity.ok().body(skill);

    }
} 	