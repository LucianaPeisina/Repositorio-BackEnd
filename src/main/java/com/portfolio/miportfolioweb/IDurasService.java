package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface IDurasService {
    public List<Duras> verDuras();

    public Duras crearDura(Duras dur);

    public void borrarDura(Long id);

    public Duras buscarDura(Long id);
    
    public Duras actualizarDuras(Duras dura);
}
