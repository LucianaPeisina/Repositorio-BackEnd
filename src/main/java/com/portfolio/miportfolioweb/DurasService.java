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
 */
// Servicio para la entidad Proyecto


// Servicio para la entidad Dura
@Service
public class DurasService implements IDurasService {
    
    @Autowired
    public DurasRepository duraRepo;

    @Override
    public List<Duras> verDuras(Long idUsuario) {
        return duraRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearDura(Duras dura) {
        duraRepo.save(dura);
    }

    @Override
    public void borrarDura(Long id) {
        duraRepo.deleteById(id);
    }

    @Override
    public Duras buscarDura(Long id) {
        return duraRepo.findById(id).orElse(null);
    }
}


