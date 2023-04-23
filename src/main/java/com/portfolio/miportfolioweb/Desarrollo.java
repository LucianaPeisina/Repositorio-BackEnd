
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
    @JoinColumn(name = "usuario_id")
     private Usuario usuario;


    
    private String logo;
    private String nombre;
    private String nivel;
    
    //Constructor por defecto
    public Desarrollo() {}

    //Constructor con campos
    public Desarrollo( String logo, String nombre, String nivel, Usuario usuario ) {
        this.logo = logo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.usuario = usuario;
    }

    //Getters y setters
    //...

}
