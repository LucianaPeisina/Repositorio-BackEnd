/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciana
 */// Servicio para la entidad Proyecto


// Servicio para la entidad Desarrollo
@Service
public class DesarrolloService implements IDesarrolloService {
    
    @Autowired
    public DesarrolloRepository desarrolloRepo;

    @Override
    public List<Desarrollo> verDesarrollo(Long idUsuario) {
        return desarrolloRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearDesarrollo(Desarrollo desarrollo) {
        desarrolloRepo.save(desarrollo);
    }

    @Override
    public void borrarDesarrollo(Long id) {
        desarrolloRepo.deleteById(id);
    }

    @Override
    public Desarrollo buscarDesarrollo(Long id) {
        return desarrolloRepo.findById(id).orElse(null);
    }
}

