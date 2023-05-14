
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlandasService implements IBlandasService {

    @Autowired
    private BlandasRepository blandasRepository;

    @Override
    public  Blandas crearBlanda(Blandas blanda) {
        return blandasRepository.save(blanda);
    }
    
    @Override    
    public Blandas actualizarBlanda(Blandas blanda) {
        return blandasRepository.save(blanda);
    }

    @Override
    public Blandas buscarBlanda(Long blandaId) {
        return blandasRepository.findById(blandaId).orElse(null);
    }

    @Override
    public List<Blandas> verBlandas() {
        return blandasRepository.findAll();
    }

    @Override    
    public void borrarBlanda(Long blandaId) {
        blandasRepository.deleteById(blandaId);
    }
}
