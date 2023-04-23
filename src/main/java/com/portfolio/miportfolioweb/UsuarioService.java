package com.portfolio.miportfolioweb;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepo;

    @Autowired
    public DispositivoRepository dispositivoRepo;

    @Autowired
    private DispositivoService dispositivoService;
    
    @Override
    public void crearUsuario(Usuario usuario, String deviceId, String deviceType) {
         Dispositivo dispositivo = new Dispositivo(); 
         dispositivo.setUsuario(usuario);
         String token = usuario.generateNotificationToken();
          // Guardar el usuario
              // Asignar el token y otros atributos al dispositivo
        dispositivo.setNotificationToken(token);
        dispositivo.setDeviceId(UUID.randomUUID().toString());
        dispositivo.setDeviceType("Android");


        dispositivoService.crearDispositivo(dispositivo);         
       usuarioRepo.save(usuario);
    }

    @Override
    public List<Usuario> verUsuarios() {
        return usuarioRepo.findAll();
    }


    @Override
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepo.findByEmail(email).orElse(null);
    }



}
