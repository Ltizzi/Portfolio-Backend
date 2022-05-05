
package com.Portfolio.Service;

import com.Portfolio.Model.Skills;
import com.Portfolio.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skillRepo;
    
    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
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

    @Override
    public void editarSkill(Skills skill) {
        skillRepo.save(skill);
    }
    
}
