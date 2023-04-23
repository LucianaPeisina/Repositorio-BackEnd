package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IProyectosService {
    public List<Proyectos> verProyectos(Long idUsuario);

    public void crearProyecto(Proyectos pro);

    public void borrarProyecto(Long id);

    public Proyectos buscarProyecto(Long id);
}
