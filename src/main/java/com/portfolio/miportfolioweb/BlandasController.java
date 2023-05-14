
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luciana
 */

@RestController
@RequestMapping("/blandas")
@CrossOrigin("*")
public class BlandasController {
    @Autowired
    private IBlandasService blandasService;
    
@PostMapping("/")
public ResponseEntity<Blandas> agregarBlandas(@RequestBody Blandas blandas) {
    return ResponseEntity.ok(blandasService.crearBlanda(blandas));
}

@GetMapping("/")
@ResponseBody
public List<Blandas> verBlandas() {
    return blandasService.verBlandas();
}

@DeleteMapping("/{id}")
public void borrarBlanda(@PathVariable Long id) {
    blandasService.borrarBlanda(id);
}


@GetMapping("/{id}")
public Blandas buscarBlandas(@PathVariable Long id) {
    return blandasService.buscarBlanda(id);
}

@PutMapping("/")
public ResponseEntity<Blandas> actualizarBlandas(@RequestBody Blandas blanda) {
    return ResponseEntity.ok(blandasService.actualizarBlanda(blanda));
}

    
    
    
}
