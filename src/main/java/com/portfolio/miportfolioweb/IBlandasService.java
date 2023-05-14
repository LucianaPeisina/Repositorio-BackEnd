package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IBlandasService {
    public Blandas crearBlanda(Blandas bla);

    public void borrarBlanda(Long id);

    public Blandas buscarBlanda(Long id);
    
    public Blandas actualizarBlanda(Blandas bla);

    public List<Blandas> verBlandas(Long idPersona);
}
