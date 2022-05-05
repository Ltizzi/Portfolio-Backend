
package com.Portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long contacto_id;
    
    private String nombre;
    private String email;
    private String about;
    private Boolean visto; 
    
    
}
