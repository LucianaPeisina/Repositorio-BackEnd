
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciana
 */

@Service
public interface IPersonaService {
    public List <Persona> verPersonas(Long idUsuario);
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
}
