
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Luciana
 */
// Servicio de Proyectos


@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    private ProyectosRepository proyectosRepository;

    @Override
    public Proyectos agregarProyecto(@RequestBody Proyectos proyecto) {
        return proyectosRepository.save(proyecto);
    }
    
    @Override
    public Proyectos buscarProyecto(@PathVariable Long proyectoId) {
        return proyectosRepository.findById(proyectoId).orElse(null);
    }
    
    @Override
    public List<Proyectos> verProyectos() {
        return proyectosRepository.findAll();
    }

    @Override
    public Proyectos actualizarProyecto(@RequestBody Proyectos proyecto) {
        return proyectosRepository.save(proyecto);
    }

    @Override
    
    public void borrarProyecto(@PathVariable Long proyectoId) {
        proyectosRepository.deleteById(proyectoId);
    }
}
