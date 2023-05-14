package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String logo;
    private String nombre;
    private String nivel;
    
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setUsuario(Persona persona) {
        this.persona = persona;
    }



    public Skills(){
    }
    
    public Skills(String logo, String nombre, String nivel, Persona persona){
        this.logo = logo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.persona = persona;
    }
}
