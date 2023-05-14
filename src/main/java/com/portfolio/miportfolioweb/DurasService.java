package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DurasService implements IDurasService {
    
    @Autowired
    private DurasRepository duraRepo;

    @Override
    public List<Duras> verDuras() {
        return duraRepo.findAll();
    }

    @Override
    public Duras crearDura(Duras dura) {
        return duraRepo.save(dura);
    }

    @Override
    public void borrarDura(Long id) {
        duraRepo.deleteById(id);
    }

    @Override
    public Duras buscarDura(Long id) {
        return duraRepo.findById(id).orElse(null);
    }
    
    @Override
    public Duras actualizarDuras(Duras dura) {
        return duraRepo.save(dura);
    }
}
