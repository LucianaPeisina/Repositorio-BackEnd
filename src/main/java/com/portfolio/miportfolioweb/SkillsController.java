
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
@RequestMapping("/skills")
@CrossOrigin("*")

public class SkillsController {
 
    @Autowired
    private ISkillsService skillsService;

    @PostMapping("/")
    public ResponseEntity<Skills> agregarSkills(@RequestBody Skills skills) {
        return ResponseEntity.ok(skillsService.crearSkill(skills));
    }

    @GetMapping("/")
    @ResponseBody
    public List<Skills> verSkills(@PathVariable Long idPersona) {
        return skillsService.verSkills(idPersona);
    }

    @DeleteMapping("/{id}")
    public void borrarSkills(@PathVariable Long id) {
        skillsService.borrarSkill(id);
    }

    @GetMapping("/{id}")
    public Skills buscarSkills(@PathVariable Long id) {
        return skillsService.buscarSkill(id);
    }

    @PutMapping("/")
    public ResponseEntity<Skills> actualizarSkills(@RequestBody Skills skills) {
        return ResponseEntity.ok(skillsService.actualizarSkills(skills));
    }

}
