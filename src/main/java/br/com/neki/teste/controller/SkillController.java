package br.com.neki.teste.controller;
//package controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import domain.Skill;
//import service.SkillService;
//
//@RestController
//@RequestMapping("/skill")
//public class SkillController {
//
//	@Autowired
//	SkillService skillService;
//	
//	@GetMapping("/listarTudo")
//	public ResponseEntity<List<Skill>> listar(){
//		List<Skill> skills = skillService.listarTodas();
//		return ResponseEntity.ok(skills);
//	}
//	
//	@GetMapping(value = "/{id}")
//    public ResponseEntity<Optional<Skill>> buscarPorId(@PathVariable Integer id) {
//        Optional<Skill> skill = skillService.listarPorId(id);
//        return ResponseEntity.ok().body(skill);
//    }
//	
//	@PostMapping("/inserir")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Skill inserirHabilidade( @RequestBody @Valid  Skill skill) {
//        return skillService.inserir(skill);
//    }
//	
//	 @PutMapping("/atualizar")
//	 public Skill atualizarHabilidade(@RequestBody Skill skill) {
//		 return skillService.atualizar(skill);
//	 }
//	
//	
//	@DeleteMapping("/deletar")
//	public void deletarHabilidade(@RequestBody Skill skill) {
//		skillService.deletar(skill);
//	}
//	
//}