
package com.Portfolio.Service;

import com.Portfolio.Model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyectos();
    
    public void crearProyecto (Proyecto proy);
    
    public void borrarProyecto (Long id);
    
    public Proyecto buscaProyecto (Long id);
    
    public void editarProyecto (Proyecto proy);
    
}
