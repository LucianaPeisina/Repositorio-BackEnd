package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IBlandasService {
    public List<Blandas> verBlandas(Long idUsuario);

    public void crearBlanda(Blandas bla);

    public void borrarBlanda(Long id);

    public Blandas buscarBlanda(Long id);
}
