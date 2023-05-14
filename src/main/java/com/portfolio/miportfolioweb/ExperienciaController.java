
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
@RequestMapping("/experiencia")
@CrossOrigin("*")
public class ExperienciaController {
    @Autowired
    private IExperienciaService experienciaService;
    
   @PostMapping("/")
public ResponseEntity<Experiencia> agregarExperiencia(@RequestBody Experiencia experiencia) {
    return ResponseEntity.ok(experienciaService.crearExperiencia(experiencia));
}

@GetMapping("/")
@ResponseBody
public List<Experiencia> verExperiencia(@PathVariable Long idPersona) {
    return experienciaService.verExperiencias(idPersona);
}

@DeleteMapping("/{id}")
public void borrarExperiencia(@PathVariable Long id) {
    experienciaService.borrarExperiencia(id);
}

@GetMapping("/{id}")
public Experiencia buscarExperiencia(@PathVariable Long id) {
    return experienciaService.buscarExperiencia(id);
}

@PutMapping("/")
public ResponseEntity<Experiencia> actualizarExperiencia(@RequestBody Experiencia experiencia) {
    return ResponseEntity.ok(experienciaService.actualizarExperiencia(experiencia));
}

    
}
