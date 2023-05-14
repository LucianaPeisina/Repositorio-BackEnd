package com.portfolio.miportfolioweb;

import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    
    public Experiencia crearExperiencia(Experiencia experiencia);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia buscarExperiencia(Long id);
    
    public Experiencia actualizarExperiencia(Experiencia experiencia);
}
