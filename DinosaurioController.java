package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Dinosaurio;
import com.generation.services.DinosaurioService;


@Controller
@RequestMapping("/dinosaurio")//ruta para desplegar jsp	
public class DinosaurioController {

//inyeccion de dependencias
@Autowired
DinosaurioService dinosaurioService;

@RequestMapping("")
public String registroDinosaurio (@ModelAttribute("Dinosaurio") Dinosaurio dinosaurio) {
	
	return "registroDinosaurio.jsp"; //la pagina a deplegar
	
	//pasamos el objeto usuario vacio
					
}
//ruta para capturar los datos del formulario, //localhost:8080/registroDinosaurio/dinosaurio
	@PostMapping("/dinosaurio/registroDinosaurio")
	public String registroUsuario(@RequestParam(value="especie") String especie,
			@RequestParam(value="color") String color,
			@RequestParam(value="altura") int altura
			) {
		System.out.println("parametro especie "+especie);
		System.out.println("parametro color  "+color);
		System.out.println("parametro altura "+altura);
		
		return "registroDinosaurio.jsp"; //la pagina a deplegar
}
	@PostMapping("/dinosaurio")
	public String guardarDinosaurio(@Valid @ModelAttribute("dinosaurio") Dinosaurio dinosaurio,
			BindingResult resultado,
			Model model) {
		
		
		if(resultado.hasErrors()) {//capturando si existe un error en el igreso de datos desde el jsp
			model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
			return "registroDinosaurio.jsp";
		}else {
		
		//capturamos el objeto con los atributos llenos
		System.out.println(dinosaurio.getEspecie()+" "+dinosaurio.getColor()+ " "+ dinosaurio.getAltura());
		
		String variable= "";
		//enviar el objeto al service
		dinosaurioService.saveDinosaurio(dinosaurio);
		
		
		return "indexDinosaurio.jsp"; //la pagina a deplegar
		}
	}
}
