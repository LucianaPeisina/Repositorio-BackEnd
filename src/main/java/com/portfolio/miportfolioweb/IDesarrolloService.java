package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IDesarrolloService {
    public List<Desarrollo> verDesarrollo(Long idPersona);

    public Desarrollo crearDesarrollo(Desarrollo dev);

    public void borrarDesarrollo(Long id);

    public Desarrollo buscarDesarrollo(Long id);

    public Desarrollo actualizarDesarrollo(Desarrollo desarrollo);
}
