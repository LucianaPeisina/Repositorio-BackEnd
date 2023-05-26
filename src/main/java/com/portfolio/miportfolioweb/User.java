package com.portfolio.miportfolioweb;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

    private byte[] img;

    
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    
    
 
    public User() {
    }

    public User(Long id, String name, String email, String password, UserRole userRole, Persona persona) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
        this.persona = persona;
    }
 
}