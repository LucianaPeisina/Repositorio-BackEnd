package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> verExperiencias(Long idUsuario) {
        return experienciaRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }
}
