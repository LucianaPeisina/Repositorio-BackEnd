package com.portfolio.miportfolioweb;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String clase;
    
    private String icono;
    
    private String nombre;
    
    private String lugar;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date start;
    
    private String end;
    
    private String contenido;
    
    private String extra;
    
    private int estado;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
     private Usuario usuario;

    
    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipo;
    
    public Experiencia() {
    }

    public Experiencia(int id, String clase, String icono, String nombre, String lugar, Date start, String end, String contenido, String extra, int estado, Usuario usuario, Tipo tipo) {
        this.id = id;
        this.clase = clase;
        this.icono = icono;
        this.nombre = nombre;
        this.lugar = lugar;
        this.start = start;
        this.end = end;
        this.contenido = contenido;
        this.extra = extra;
        this.estado = estado;
        this.usuario = usuario;
        this.tipo = tipo;
    }
}
