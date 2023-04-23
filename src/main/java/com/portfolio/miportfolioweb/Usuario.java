package com.portfolio.miportfolioweb;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter 
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JoinColumn(name = "dispositivo_id")
    private Dispositivo dispositivo;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Usuario(String email, String password, Dispositivo dispositivo, Persona persona) {
        this.email = email;
        this.password = password;
        this.dispositivo = dispositivo;
        this.persona = persona;
        
    }

    public String generateNotificationToken() {
        // Lógica para generar el token de notificación único
        return UUID.randomUUID().toString();
    }
}
