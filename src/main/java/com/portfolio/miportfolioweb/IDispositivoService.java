package com.portfolio.miportfolioweb;

import java.util.List;

public interface IDispositivoService {
    List<Dispositivo> verDispositivos(Long idUsuario);
    void crearDispositivo(Dispositivo dispositivo);

}
