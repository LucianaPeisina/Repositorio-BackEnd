package com.portfolio.miportfolioweb;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;
    private String telefono;
    private String sobreMi;
    private String urlFoto;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    
    private User usuario;

@OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Blandas> blandas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Experiencia> experiencias = new LinkedHashSet<>();
  
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Duras> duras = new LinkedHashSet<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Proyectos> proyectos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Desarrollo> desarrollos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Skills> skills = new LinkedHashSet<>();


    
    public Persona(){
    }
    
    public Persona (Long id, String nombre, String apellido, String domicilio, Date fechaNacimiento, String telefono, String sobreMi, String urlFoto, User usuario){
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
    
     public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    public String getNombre() {
        return nombre;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Set<Duras> getDuras() {
        return duras;
    }

    public void setDuras(Set<Duras> duras) {
        this.duras = duras;
    }
    
    public Set<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(Set<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public Set<Blandas> getBlandas() {
        return blandas;
    }

    public void setBlandas(Set<Blandas> blandas) {
        this.blandas = blandas;
    }
    
    
    public Set<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(Set<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }



    public Set<Desarrollo> getDesarrollos() {
        return desarrollos;
    }

    public void setDesarrollos(Set<Desarrollo> desarrollos) {
        this.desarrollos = desarrollos;
    }


    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }

}
