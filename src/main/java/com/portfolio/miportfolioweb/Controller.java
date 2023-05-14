package com.portfolio.miportfolioweb;

import java.util.List;
import com.portfolio.miportfolioweb.IPersonaService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private IPersonaService personaService;
    
    @PostMapping("/")
    public ResponseEntity<Persona> agregarPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.crearPersona(persona));
    }

    @GetMapping("/")
    @ResponseBody
    public List<Persona> verPersonas() {
        return personaService.verPersonas();
    }

    @DeleteMapping("/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }

    @GetMapping("/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        return personaService.buscarPersona(id);
    }

    @PutMapping("/")
    public ResponseEntity<Persona> actualizarPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.actualizarPersona(persona));
    }




    




}

