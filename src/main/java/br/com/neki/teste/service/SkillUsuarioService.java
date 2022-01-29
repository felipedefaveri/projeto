package br.com.neki.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.SkillUsuario;
import br.com.neki.teste.exception.NotFoundException;
import br.com.neki.teste.repository.SkillUsuarioRepository;

@Service
public class SkillUsuarioService {
	@Autowired
	SkillUsuarioRepository skillUsuarioRepository;
	
	public List<SkillUsuario> listarTodas(){
		if (skillUsuarioRepository.findAll() == null) {
			throw new NotFoundException("Não encontrado.");
		}
		return skillUsuarioRepository.findAll();
	}
	
	public Optional<SkillUsuario> listarPorId(Long id){
		skillUsuarioRepository.findById(id);
		if (skillUsuarioRepository.findById(id) == null) {
			throw new NotFoundException("Habilidade não encontrada.");
		}
		return skillUsuarioRepository.findById(id);
	}
	
	public SkillUsuario inserir(SkillUsuario skillUsuario){
		return skillUsuarioRepository.save(skillUsuario);
	}
	
	public ResponseEntity<SkillUsuario> atualizar(SkillUsuario skillUsuario, Long id) {
		if(!skillUsuarioRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
			
		}
			skillUsuario.setId(id);
			skillUsuario = skillUsuarioRepository.save(skillUsuario);
			return ResponseEntity.ok(skillUsuario);
	}
	
	public ResponseEntity<Object> deletar(Long id) {
		if(!skillUsuarioRepository.existsById(id)) {
		return ResponseEntity.notFound().build();
		
	}
		skillUsuarioRepository.deleteById(id);;
		return ResponseEntity.noContent().build();

}}
