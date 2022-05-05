package com.Portfolio.Service;


import com.Portfolio.Model.Proyecto;
import com.Portfolio.Repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepo proyRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto buscaProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }
    
}
