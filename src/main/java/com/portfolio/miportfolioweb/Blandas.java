package com.portfolio.miportfolioweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Blandas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    public Blandas() {
    }

    public Blandas(String nombre, Usuario usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    // getters y setters
}
