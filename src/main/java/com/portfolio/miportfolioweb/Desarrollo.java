
package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Desarrollo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setUsuario(Persona persona) {
        this.persona = persona;
    }

    
    private String logo;
    private String nombre;
    private String nivel;
    
    //Constructor por defecto
    public Desarrollo() {}

    //Constructor con campos
    public Desarrollo( String logo, String nombre, String nivel, Persona persona ) {
        this.logo = logo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.persona = persona;
    }


}
