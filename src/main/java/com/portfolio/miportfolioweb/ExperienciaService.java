package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    private ExperienciaRepository experienciasRepository;

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return experienciasRepository.save(experiencia);
    }
    
    @Override    
    public Experiencia actualizarExperiencia(Experiencia experiencia) {
        return experienciasRepository.save(experiencia);
    }

    @Override
    public Experiencia buscarExperiencia(Long experienciaId) {
        return experienciasRepository.findById(experienciaId).orElse(null);
    }

    @Override
    public List<Experiencia> verExperiencias(Long idPersona) {
        return experienciasRepository.findByPersonaId(idPersona);
    }
    
    @Override    
    public void borrarExperiencia(Long experienciaId) {
        experienciasRepository.deleteById(experienciaId);
    }
}
