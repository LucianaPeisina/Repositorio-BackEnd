package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IDurasService {
    public List<Duras> verDuras(Long idUsuario);

    public void crearDura(Duras dur);

    public void borrarDura(Long id);

    public Duras buscarDura(Long id);
}
