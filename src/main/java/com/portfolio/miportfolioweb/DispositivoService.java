package com.portfolio.miportfolioweb;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispositivoService implements IDispositivoService {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void crearDispositivo(Dispositivo dispositivo) {
        // Generar el token de notificación
        String token = dispositivo.getUsuario().generateNotificationToken();

        // Asignar el token al dispositivo
        dispositivo.setNotificationToken(token);
        dispositivo.setDeviceId(UUID.randomUUID().toString());
        dispositivo.setDeviceType("mobile");

    // Asignar el usuario al dispositivo
    Usuario usuario = dispositivo.getUsuario();
    if(usuario != null) {
        usuario = usuarioRepository.save(usuario);
        dispositivo.setUsuario(usuario);
    }

    // Guardar el dispositivo en la base de datos
    dispositivoRepository.save(dispositivo);
}


    @Override
    public List<Dispositivo> verDispositivos(Long idUsuario) {
        return dispositivoRepository.findByUsuarioId(idUsuario);
    }

}

