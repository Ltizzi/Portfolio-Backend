
package com.Portfolio.Service;

import com.Portfolio.Model.Exp;
import java.util.List;


public interface IExpService {
    
    
    public List<Exp> verExps();
    
    public void crearExp (Exp exp);
    
    public void borrarExp (Long id);
    
    public Exp buscarExp (Long id);
    
    public void editarExp (Exp exp);
    
    
}
