
package com.Portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Edu {
    
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long edu_id;
    private String titulo;
    private String institucion;
    private String url_institucion;
    private String img_descriptiva;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    
    @Temporal(TemporalType.DATE)
    private Date fecha_finalizado;
    
    private String descripcion; 
    
//     @ManyToOne
//     @JoinColumn(name ="persona_id")
//    private Persona persona_id;






    
  
    
    
    
}
