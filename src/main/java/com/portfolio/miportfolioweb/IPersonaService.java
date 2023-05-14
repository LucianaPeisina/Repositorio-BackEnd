
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciana
 */

@Service
public interface IPersonaService {

    List<Persona> verPersonas();

             
    public Persona crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public Persona actualizarPersona(Persona per);


}
