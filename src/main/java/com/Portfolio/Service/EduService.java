
package com.Portfolio.Service;

import com.Portfolio.Model.Edu;
import com.Portfolio.Repository.EduRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduService implements IEduService{
    
    @Autowired
    public EduRepository eduRepo;

    @Override
    public List<Edu> verEdus() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEdu(Edu edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEdu(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Edu buscarEdu(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEdu(Edu edu) {
        eduRepo.save(edu);
    }
}
