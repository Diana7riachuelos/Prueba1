package com.generation.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Dinosaurio;
import com.generation.repositories.DinosaurioRepository;

//validacion del sistema
@Service
public class DinosaurioService {
	
	//llamar al repository
	@Autowired
	DinosaurioRepository DinosaurioRepository;


	public void saveDinosaurio(@Valid Dinosaurio dinosaurio) {
		DinosaurioRepository.save(dinosaurio);
		
	}
	
	
		
	}
	
	

