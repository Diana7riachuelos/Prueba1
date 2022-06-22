package dinosaurio.models;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Dinosaurios")

public class Dinosaurio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String color;
    private String especie;

    private Integer altura;
    @Size(min=3, max=20)
    private String nombre;

    public Dinosaurio() {
     super();
    }

    public Dinosaurio(Long id, String color, String especie, Integer altura, String nombre) {
        this.id = id;
        this.color = color;
        this.especie = especie;
        this.altura = altura;
        this.nombre = nombre;
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

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
