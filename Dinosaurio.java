package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
//persistencia
@Entity
@Table(name="Dinosaurio")

public class Dinosaurio {
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Size(min=3, max= 7)
	private int altura;
	
	@Size(min=3, max= 20)
	private String color;
	
	@Size(min=3, max= 20)
	private String especie;
	
	//constructores

	public Dinosaurio() {
		super();
	}
	public Dinosaurio(Long id, int altura, String color, String especie) {
		super();
		this.id = id;
		this.altura = altura;
		this.color = color;
		this.especie = especie;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	

}
