
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luciana
 */
// Servicio para la entidad Skill
@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skillRepo;

    @Override
    public List<Skills> verSkills(Long idUsuario) {
        return skillRepo.findByUsuarioId(idUsuario);
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
}
