

package com.Portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long skill_id;
    private String skill_nombre;
    private String nivel;
    private String url_icon;
    private String descripcion; 
    
//    @ManyToOne
//    @JoinColumn(name ="persona_id")
//    private Persona persona_id;
    
}
