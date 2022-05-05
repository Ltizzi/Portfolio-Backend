
package com.Portfolio.Service;

import com.Portfolio.Model.Persona;
import com.Portfolio.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepository;

    @Override
    public List<Persona> verPersonas() {
        return persoRepository.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepository.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void editarPersona(Persona per) {
        persoRepository.save(per);
    }
    
}
