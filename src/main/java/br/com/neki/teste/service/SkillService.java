package br.com.neki.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.Skill;
import br.com.neki.teste.exception.NotFoundException;
import br.com.neki.teste.repository.SkillRepository;


@Service
public class SkillService {

	@Autowired
	SkillRepository skillRepository;
	
	public List<Skill> listarTodas(){
		if (skillRepository.listarSkills() == null) {
			throw new NotFoundException("Não encontrado.");
		}
		return skillRepository.listarSkills();
	}
	
	public Optional<Skill> listarPorId(Integer id){
		skillRepository.findById(id);
		if (skillRepository.findById(id) == null) {
			throw new NotFoundException("Habilidade não encontrada.");
		}
		return skillRepository.findById(id);
	}
	
	public Skill inserir(Skill skill){
		return skillRepository.save(skill);
	}
	
	public Skill atualizar(Skill skill) {
		return skillRepository.save(skill);
	}
	
	public Skill deletar(Skill skill) {
		skillRepository.delete(skill);
		return null;
	}
	
}
