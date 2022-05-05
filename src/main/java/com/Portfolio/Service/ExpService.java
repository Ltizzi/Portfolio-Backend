
package com.Portfolio.Service;

import com.Portfolio.Model.Exp;
import com.Portfolio.Repository.ExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpService implements IExpService{
    
     @Autowired
    public ExpRepository expRepo;

    @Override
    public List<Exp> verExps() {
        return expRepo.findAll();
    }

    @Override
    public void crearExp(Exp exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExp(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Exp buscarExp(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    @Override
    public void editarExp(Exp exp) {
        expRepo.save(exp);
    }
    
}
