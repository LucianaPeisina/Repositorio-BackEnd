package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesarrolloService implements IDesarrolloService {

    @Autowired
    private DesarrolloRepository desarrolloRepository;

    @Override
    public Desarrollo crearDesarrollo(Desarrollo desarrollo) {
        return desarrolloRepository.save(desarrollo);
    }
    
    @Override    
    public Desarrollo actualizarDesarrollo(Desarrollo desarrollo) {
        return desarrolloRepository.save(desarrollo);
    }

    @Override
    public Desarrollo buscarDesarrollo(Long desarrolloId) {
        return desarrolloRepository.findById(desarrolloId).orElse(null);
    }

    @Override
    public List<Desarrollo> verDesarrollo(Long idPersona) {
        return desarrolloRepository.findByPersonaId(idPersona);
    }
    @Override    
    public void borrarDesarrollo(Long desarrolloId) {
        desarrolloRepository.deleteById(desarrolloId);
    }
}
