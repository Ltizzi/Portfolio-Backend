
package com.Portfolio.Service;

import com.Portfolio.Model.Edu;
import java.util.List;


public interface IEduService {
    
    public List<Edu> verEdus();
    
    public void crearEdu (Edu edu);
    
    public void borrarEdu (Long id);
    
    public Edu buscarEdu (Long id);
    
    public void editarEdu (Edu edu);
    
}
