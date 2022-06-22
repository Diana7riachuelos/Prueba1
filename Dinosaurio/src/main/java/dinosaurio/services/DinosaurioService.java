package dinosaurio.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dinosaurio.models.Dinosaurio;
import dinosaurio.repositories.DinosaurioRepository;


import java.util.List;

import javax.validation.Valid;

public class DinosaurioService {
	@Autowired
    DinosaurioRepository dinosaurioRepository;

    public void guardarRegistro(@Valid Dinosaurio dinosaurio) {

        dinosaurioRepository.save(dinosaurio);

    }

    public List<Dinosaurio> findAll(){

        return dinosaurioRepository.findAll();


    }


}
