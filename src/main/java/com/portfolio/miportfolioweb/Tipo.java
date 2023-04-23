package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tipo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_tipo;
    
    public Tipo() {
        
    }
    
    public Tipo(int id, String nombre_tipo) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
    }
}
