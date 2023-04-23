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
// Servicio de Proyectos

// Implementación del Servicio de Proyectos
// Servicio para la entidad Proyecto
@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyectoRepo;

    @Override
    public List<Proyectos> verProyectos(Long idUsuario) {
        return proyectoRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearProyecto(Proyectos proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
}


