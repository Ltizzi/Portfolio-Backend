
package com.Portfolio.Service;

import com.Portfolio.Model.Tipo_trabajo;
import java.util.List;


public interface ITIpo_trabajoService {
    
    public List<Tipo_trabajo> verSkills();
    
    public void crearTipo(Tipo_trabajo tipo);
    
    public void borrarTipo (Long id);
    
    public Tipo_trabajo buscarTipo (Long id);
    
    public void editarTipo (Tipo_trabajo tipo);
    
}
