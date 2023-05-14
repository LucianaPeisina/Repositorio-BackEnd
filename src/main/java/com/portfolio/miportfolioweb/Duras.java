package com.portfolio.miportfolioweb;
        
import com.portfolio.miportfolioweb.Persona;
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
public class Duras {
    
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

    private String num;
    private String nombre;
    private String nivel;
    
    public Duras() {
    }
    
    public Duras(Long id, Persona persona, String num, String nombre, String nivel) {
        this.id=id;
        this.persona= persona;
        this.num = num;
        this.nombre = nombre;
        this.nivel = nivel;
    }
}
