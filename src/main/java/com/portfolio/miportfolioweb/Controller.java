package com.portfolio.miportfolioweb;

import java.util.List;
import com.portfolio.miportfolioweb.IPersonaService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private IPersonaService persoRepo;
    
    @Autowired
    private IExperienciaService experienciaService;
    
    @Autowired
    private IProyectosService proyectosService;
    
    @Autowired
    private ISkillsService skillsService;
    
    @Autowired
    private IBlandasService blandasService;
    
    @Autowired
    private IDurasService durasService;
    
    @Autowired
    private IDesarrolloService desarrolloService;
    
    @Autowired
    private ITipoService tipoService;
    
    
    @Autowired
    private IUsuarioService usuarioService;
    
    
    @Autowired
    private IDispositivoService dispositivoService;
    
    
    @PostMapping("/api/auth/register")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        // Generar un nuevo deviceId y deviceType aleatorio para el dispositivo
        String deviceId = UUID.randomUUID().toString();
        String deviceType = "mobile";

        // Crear el dispositivo y asignarle el usuario
        Dispositivo dispositivo = new Dispositivo(deviceId, deviceType);
        String token = usuario.generateNotificationToken(); // Generar el token de notificación
        dispositivo.setNotificationToken(token); // Establecer el token en el dispositivo
        dispositivo.setUsuario(usuario);

        // Asignar el dispositivo al usuario
        usuario.setDispositivo(dispositivo);

        // Crear y guardar el usuario en la base de datos
        usuarioService.crearUsuario(usuario, deviceId, deviceType);


        // Retornar la respuesta con el usuario
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/api/new/personas")
    public void agregarPersona(@RequestBody Persona persona) {
        persoRepo.crearPersona(persona);
    }
    
        
    
    @PostMapping("/api/new/experiencias")
    public void agregarExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.crearExperiencia(experiencia);
    }
    
    @PostMapping("/api/new/proyectos")
    public void agregarProyecto(@RequestBody Proyectos proyecto) {
        proyectosService.crearProyecto(proyecto);
    }
    
    @PostMapping("/api/new/skills")
    public void agregarSkills(@RequestBody Skills skills) {
        skillsService.crearSkill(skills);
    }
    
    @PostMapping("/api/new/tipos")
    public void crearTipo(@RequestBody Tipo tipo) {
        tipoService.crearTipo(tipo);
    }
    
    
    @PostMapping("/api/new/blandas")
    public void agregarBlandas(@RequestBody Blandas blandas) {
        blandasService.crearBlanda(blandas);
    }
    
    @PostMapping("/api/new/duras")
    public void agregarDuras(@RequestBody Duras duras) {
        durasService.crearDura(duras);
    }
    
    @PostMapping("/api/new/desarrollo")
    public void agregarDesarrollo(@RequestBody Desarrollo desarrollo) {
        desarrolloService.crearDesarrollo(desarrollo);
    }

    @GetMapping("/api/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(Long idUsuario) {
        return experienciaService.verExperiencias(idUsuario);
    }
    
    @GetMapping("/api/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios() {
        return usuarioService.verUsuarios();
    }
    
    @GetMapping("/api/ver/duras")
    @ResponseBody
    public List<Duras> verDuras(Long idUsuario) {
        return durasService.verDuras(idUsuario);
    }
    
    @GetMapping("/api/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(Long idUsuario) {
        return proyectosService.verProyectos(idUsuario);
    }
    
    @GetMapping("/api/ver/blandas")
    @ResponseBody
    public List<Blandas> verBlandas(Long idUsuario) {
        return blandasService.verBlandas(idUsuario);
    }
    
    @GetMapping("/api/ver/skills")
    @ResponseBody
    public List<Skills> verSkills(Long idUsuario) {
        return skillsService.verSkills(idUsuario);
    }

    @GetMapping("/api/ver/desarrollo")
    @ResponseBody
    public List<Desarrollo> verDesarrollo(Long idUsuario) {
        return desarrolloService.verDesarrollo(idUsuario);
    }
    
    @GetMapping("/api/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas(Long idUsuario) {
        return persoRepo.verPersonas(idUsuario);
    }

    
    @DeleteMapping("/api/delete/persona/{id}")
    public void borrarPersona(Long id) {
        persoRepo.borrarPersona(id);
    }

    @DeleteMapping("/api/delete/experiencia/{id}")
    public void borrarExperiencia( Long id) {
        experienciaService.borrarExperiencia(id);
    }

    @DeleteMapping("/api/delete/proyecto/{id}")
    public void borrarProyecto(Long id) {
        proyectosService.borrarProyecto(id);
    }

    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill( Long id) {
        skillsService.borrarSkill(id);
    }

    @DeleteMapping("/api/delete/blanda/{id}")
    public void borrarBlanda( Long id) {
        blandasService.borrarBlanda(id);
    }

    @DeleteMapping("/api/delete/dura/{id}")
    public void borrarDura(Long id) {
        durasService.borrarDura(id);
    }

    @DeleteMapping("/api/delete/desarrollo/{id}")
    public void borrarDesarrollo( Long id) {
        desarrolloService.borrarDesarrollo(id);
    }
    
    
    @DeleteMapping("/api/delete/tipo/{id}")
    public void borrarTipo( Long id) {
        tipoService.borrarTipo(id);
    }
    
    @DeleteMapping("/api/delete/usuario/{id}")
    public void borrarUsuario( Long id) {
        usuarioService.borrarUsuario(id);
    }

    
    
    @GetMapping("/api/ver/experiencia/{id}")
    public Experiencia buscarExperiencia(Long id) {
        return experienciaService.buscarExperiencia(id);
    }

    @GetMapping("/api/ver/dura/{id}")
    public Duras buscarDura(Long id) {
        return durasService.buscarDura(id);
    }

    @GetMapping("/ver/proyectos/{id}")
    public Proyectos buscarProyecto( Long id) {
        return proyectosService.buscarProyecto(id);
    }

    @GetMapping("/api/ver/skill/{id}")
    public Skills buscarSkill(Long id) {
        return skillsService.buscarSkill(id);
    }

    @GetMapping("/api/ver/blanda/{id}")
    public Blandas buscarBlanda(Long id) {
        return blandasService.buscarBlanda(id);
    }
    
    @GetMapping("/api/ver/desarrollo/{id}")
    @ResponseBody
    public Desarrollo buscarDesarrollo( Long id) {
        return desarrolloService.buscarDesarrollo(id);
    }
    
    @GetMapping("/api/ver/usuarios/{id}")
    @ResponseBody
    public Usuario buscarUsuario( Long id) {
        return usuarioService.buscarUsuario(id);
    }



    @GetMapping("/api/buscar/tipo/{id}")
    @ResponseBody
    public Tipo buscarTipo(Long id) {
        return tipoService.buscarTipo(id);
    }   
    




}

