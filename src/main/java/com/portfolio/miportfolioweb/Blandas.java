package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Blandas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public Blandas() {
    }

    public Blandas(String nombre, Persona persona) {
        this.nombre = nombre;
        this.persona = persona;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public String getNombre() {
        return nombre;
        
        
    }


}
