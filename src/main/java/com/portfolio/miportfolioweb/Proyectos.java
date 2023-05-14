package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String nombre;
    private String descrip;
    private String enlace;
    
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setUsuario(Persona persona) {
        this.persona = persona;
    }


    public Proyectos() {
    }

    public Proyectos(Long id, String img, String nombre, String descrip, String enlace, Persona persona) {
        this.id = id;
        this.img = img;
        this.nombre = nombre;
        this.descrip = descrip;
        this.enlace = enlace;
        this.persona = persona;
    }
}
