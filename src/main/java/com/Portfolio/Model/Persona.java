
package com.Portfolio.Model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long persona_id;
    
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date birth_date;
    private String mail;
    private String ciudad;
    private String pais;
    private String about;
    private String profile_pic;
    private String github;
    private String facebook;
    private String twitter;
    private String linkedin;

    
    
     
}
