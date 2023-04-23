/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luciana
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    List<Persona> findByUsuarioId(Long idUsuario);
    
}
