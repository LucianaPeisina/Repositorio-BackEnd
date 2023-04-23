
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlandasService implements IBlandasService {
    
    @Autowired
    public BlandasRepository blandasRepo;

    @Override
    public List<Blandas> verBlandas(Long idUsuario) {
        return blandasRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearBlanda(Blandas blandas) {
        blandasRepo.save(blandas);
    }

    @Override
    public void borrarBlanda(Long id) {
        blandasRepo.deleteById(id);
    }

    @Override
    public Blandas buscarBlanda(Long id) {
        return blandasRepo.findById(id).orElse(null);
    }
}
