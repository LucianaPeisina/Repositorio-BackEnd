package com.portfolio.miportfolioweb;


import org.springframework.stereotype.Service;

@Service
public interface ITipoService {

    public Tipo crearTipo(Tipo dev);

    public void borrarTipo(Long id);

    public Tipo buscarTipo(Long id);
}
