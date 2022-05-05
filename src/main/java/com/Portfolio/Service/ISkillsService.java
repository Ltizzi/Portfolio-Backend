
package com.Portfolio.Service;

import com.Portfolio.Model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List<Skills> verSkills();
    
    public void crearSkill (Skills skill);
    
    public void borrarSkill (Long id);
    
    public Skills buscarSkill (Long id);
    
    public void editarSkill (Skills skill);
    
}
