package com.portfolio.miportfolioweb;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private Date fechaNacimiento;
    private String telefono;
    private String sobreMi;
    private String urlFoto;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    
    private Usuario usuario;

    // getters y setters
    
    
    public Persona(){
    }
    
    public Persona (int id, String nombre, String apellido, String domicilio, Date fechaNacimiento, String telefono, String sobreMi, String urlFoto, Usuario usuario){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.sobreMi = sobreMi;
        this.urlFoto = urlFoto;
        this.usuario = usuario;
    }
}
