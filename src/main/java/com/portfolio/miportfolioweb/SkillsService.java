
package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public Skills crearSkill(Skills ski) {
        return skillsRepository.save(ski);
    }
    
    @Override    
    public Skills actualizarSkills(Skills skill) {
        return skillsRepository.save(skill);
    }

    @Override
    public Skills buscarSkill(Long skillId) {
        return skillsRepository.findById(skillId).orElse(null);
    }

    @Override
    public List<Skills> verSkills() {
        return skillsRepository.findAll();
    }

    @Override    
    public void borrarSkill(Long skillId) {
        skillsRepository.deleteById(skillId);
    }
}


