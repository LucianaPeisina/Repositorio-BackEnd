
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
@RequestMapping("/duras")
@CrossOrigin("*")
public class DurasController {
    
   @Autowired
    private IDurasService durasService;
   
   @PostMapping("/")
   public ResponseEntity<Duras> agregarDuras(@RequestBody Duras duras) {
       return ResponseEntity.ok( durasService.crearDura(duras));
    }
   
    @GetMapping("/")
    @ResponseBody
    public List<Duras> verDuras() {
        return durasService.verDuras();
    }
    
    @DeleteMapping("/{id}")
    public void borrarDura(@PathVariable Long id) {
        durasService.borrarDura(id);
    }
    
    @GetMapping("/{id}")
    public Duras buscarDura(@PathVariable Long id) {
        return durasService.buscarDura(id);
    }
    
    
    @PutMapping("/")
    public ResponseEntity<Duras> actualizarDuras(@RequestBody Duras dura) {
        return ResponseEntity.ok(  durasService.actualizarDuras(dura));
    }



    


    

    
}
