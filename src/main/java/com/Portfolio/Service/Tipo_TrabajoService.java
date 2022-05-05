
package com.Portfolio.Service;

import com.Portfolio.Model.Tipo_trabajo;
import com.Portfolio.Repository.Tipo_trabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class Tipo_TrabajoService implements ITIpo_trabajoService{
    
    @Autowired
    public Tipo_trabajoRepository tipoRepo;

    @Override
    public List<Tipo_trabajo> verSkills() {
        return tipoRepo.findAll();
    }

    @Override
    public void crearTipo(Tipo_trabajo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void borrarTipo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public Tipo_trabajo buscarTipo(Long id) {
        return tipoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarTipo(Tipo_trabajo tipo) {
        tipoRepo.save(tipo);
    }
    
}
