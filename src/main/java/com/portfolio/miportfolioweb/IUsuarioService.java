package com.portfolio.miportfolioweb;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> verUsuarios();

    public void crearUsuario(Usuario usuario, String deviceId, String deviceType);

    public void borrarUsuario(Long id);

    public Usuario buscarUsuario(Long id);
    
    public Usuario buscarUsuarioPorEmail(String email);
}
