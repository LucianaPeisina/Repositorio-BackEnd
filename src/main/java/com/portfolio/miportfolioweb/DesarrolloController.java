
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
@RequestMapping("/desarrollo")
@CrossOrigin("*")
public class DesarrolloController {
    @Autowired
    private IDesarrolloService desarrolloService;
    

    @PostMapping("/")
    public void crearDesarrollo(@RequestBody Desarrollo desarrollo) {
        desarrolloService.crearDesarrollo(desarrollo);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Desarrollo buscarDesarrollo(@PathVariable Long id) {
        return desarrolloService.buscarDesarrollo(id);
    }

    @DeleteMapping("/{id}")
    public void borrarDesarrollo(@PathVariable Long id) {
        desarrolloService.borrarDesarrollo(id);
    }


    @GetMapping("/")
    @ResponseBody
    public List<Desarrollo> verDesarrollo(Long idPersona) {
        return desarrolloService.verDesarrollo(idPersona);
    }
    
    @PutMapping("/")
    public void actualizarDesarrollo(Desarrollo desarrollo) {
       desarrolloService.actualizarDesarrollo(desarrollo);

    }



    
    

}
