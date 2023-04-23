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
    @JoinColumn(name = "usuario_id")
     private Usuario usuario;

    private String num;
    private String nombre;
    private String nivel;
    
    public Duras() {
    }
    
    public Duras(Long id, Usuario usuario, String num, String nombre, String nivel) {
        this.id=id;
        this.usuario= usuario;
        this.num = num;
        this.nombre = nombre;
        this.nivel = nivel;
    }
}
