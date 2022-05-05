
package com.Portfolio.Model;

import java.sql.Date;
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long proyecto_id;
    private String nombre;
    private Date fecha_inicio;
    private String about;
    private String url;
    private String url_img_1;
    private String url_img_2;
    private String url_img_3;
    private String url_img_4;
    private String url_github_1;
    private String url_github_2;
}
