package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface IProyectosService {
    public Proyectos agregarProyecto(Proyectos proyecto);

    List<Proyectos> verProyectos(Long idPersona);

    void borrarProyecto(Long id);

    public Proyectos buscarProyecto(Long id);

    public Proyectos actualizarProyecto(Proyectos proyecto);
}
