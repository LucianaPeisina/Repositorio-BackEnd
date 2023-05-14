package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }
    
    @Override    
    public Persona actualizarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona buscarPersona(Long personaId) {
        return personaRepository.findById(personaId).orElse(null);
    }

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    @Override    
    public void borrarPersona(Long personaId) {
        personaRepository.deleteById(personaId);
    }
}
