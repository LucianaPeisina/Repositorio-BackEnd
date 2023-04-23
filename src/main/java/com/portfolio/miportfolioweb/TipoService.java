
package com.portfolio.miportfolioweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciana
 */

@Service
public class TipoService implements ITipoService {
    
    @Autowired
    public TipoRepository tipoRepo;

    @Override
    public void crearTipo(Tipo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void borrarTipo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public Tipo buscarTipo(Long id) {
        return tipoRepo.findById(id).orElse(null);
    }
}
