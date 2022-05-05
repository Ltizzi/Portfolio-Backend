
package com.Portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tipo_trabajo {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long tipo_Id;
    private String tipo_trabajo;
    


    public Tipo_trabajo() {
    }

    public Tipo_trabajo(Long tipo_Id, String tipo_trabajo, Exp exp) {
        this.tipo_Id = tipo_Id;
        this.tipo_trabajo = tipo_trabajo;
      
    }

  
    
    
    
    
    
}
