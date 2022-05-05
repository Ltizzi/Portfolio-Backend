
package com.Portfolio.Service;

import com.Portfolio.Model.Contacto;
import com.Portfolio.Repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    public ContactoRepository contRepo;

    @Override
    public List<Contacto> verContactos() {
        return contRepo.findAll();
     }

    @Override
    public void crearContacto(Contacto contacto) {
        contRepo.save(contacto);
     }

    @Override
    public void editarContacto(Contacto contacto) {
        contRepo.save(contacto);
    }

    @Override
    public void eliminarContacto(Long id) {
        contRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
        return contRepo.findById(id).orElse(null);
    }
    
    
    
}
