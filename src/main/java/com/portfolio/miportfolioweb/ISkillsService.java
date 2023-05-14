package com.portfolio.miportfolioweb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ISkillsService {
    public List<Skills> verSkills();

    public Skills crearSkill(Skills ski);

    public void borrarSkill(Long id);

    public Skills buscarSkill(Long id);
    
    public Skills actualizarSkills(Skills skills);
}
