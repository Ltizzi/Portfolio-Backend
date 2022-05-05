
package com.Portfolio.Service;

import com.Portfolio.Model.Contacto;
import java.util.List;


public interface IContactoService {
    
    public List<Contacto> verContactos();
    
    public void crearContacto (Contacto contacto);
    
    public void editarContacto (Contacto contacto);
    
    public void eliminarContacto (Long id);
    
    public Contacto buscarContacto (Long id);
    
}
