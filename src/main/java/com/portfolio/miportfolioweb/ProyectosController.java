
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luciana
 */



@RestController
@RequestMapping("/proyectos")
@CrossOrigin("*")
public class ProyectosController {
    
    @Autowired
    private IProyectosService proyectosService;
    
    @PostMapping("/")
    public ResponseEntity<Proyectos> agregarProyecto(@RequestBody Proyectos proyecto) {
        return ResponseEntity.ok(proyectosService.agregarProyecto(proyecto));
    }

    @GetMapping("/")
    @ResponseBody
    public List<Proyectos> verProyectos(@PathVariable Long idPersona) {
        return proyectosService.verProyectos(idPersona);
    }

    @DeleteMapping("/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proyectosService.borrarProyecto(id);
    }

    @GetMapping("/{id}")
    public Proyectos buscarProyecto(@PathVariable Long id) {
        return proyectosService.buscarProyecto(id);
    }

    @PutMapping("/")
    public ResponseEntity<Proyectos> actualizarProyecto(@RequestBody Proyectos proyecto) {
        return ResponseEntity.ok(proyectosService.actualizarProyecto(proyecto));
    }

    

    
}
