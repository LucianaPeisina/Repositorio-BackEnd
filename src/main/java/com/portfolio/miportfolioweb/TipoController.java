
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
@RequestMapping("/tipo")
@CrossOrigin("*")
public class TipoController {
    @Autowired
    private ITipoService tipoService;
    
    @PostMapping("/")
    public ResponseEntity<Tipo> agregarTipo(@RequestBody Tipo tipo) {
        return ResponseEntity.ok(tipoService.crearTipo(tipo));
    }

    @GetMapping("/{id}")
    public Tipo buscarTipo(@PathVariable Long id) {
        return tipoService.buscarTipo(id);
    }
    

    @DeleteMapping("/tipo/{id}")
    public void borrarTipo(@PathVariable Long id) {
        tipoService.borrarTipo(id);
    }


}

