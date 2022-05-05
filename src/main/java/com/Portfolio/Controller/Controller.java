
package com.Portfolio.Controller;
import com.Portfolio.Model.Contacto;
import com.Portfolio.Model.Edu;
import com.Portfolio.Model.Exp;
import com.Portfolio.Model.Persona;
import com.Portfolio.Model.Proyecto;
import com.Portfolio.Model.Skills;
import com.Portfolio.Service.IContactoService;

import com.Portfolio.Service.IEduService;
import com.Portfolio.Service.IExpService;
import com.Portfolio.Service.IPersonaService;
import com.Portfolio.Service.IProyectoService;
import com.Portfolio.Service.ISkillsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    
    //autowired services
    
    @Autowired
    private IPersonaService persoServ;
    
    @Autowired
    private IExpService expServ;
    
    @Autowired
    private IEduService eduServ;
    
    @Autowired
    private ISkillsService skillServ;
    
    @Autowired
    private IProyectoService proyServ;
    
    @Autowired
    private IContactoService contServ;
    
//    @Autowired
//    private ITIpo_trabajoService tipoServ;
    
    @RequestMapping(value = {"/**", "/persona/edit/**", "/exp/edit/**", "/edu/edit/**", "/skill/edit/**", "/proyecto/edit/**"}, 
                                method = RequestMethod.OPTIONS)    
   ResponseEntity<?>  collectionOptions() {
        return ResponseEntity.ok()
                            .allow(HttpMethod.GET, HttpMethod.POST, 
                                      HttpMethod.PATCH, HttpMethod.DELETE, 
                                      HttpMethod.OPTIONS).build();
   }
//   
//   
    @RequestMapping(value = {"/**", "/persona/edit/**", "/exp/edit/**", "/edu/edit/**", "/skill/edit/**", "/proyecto/edit/**"}, 
                                method = RequestMethod.OPTIONS, consumes = MediaType.APPLICATION_JSON_VALUE)
     @ResponseStatus(HttpStatus.OK)
   ResponseEntity<?>  singularOptions() {
        return ResponseEntity.ok()
                            .allow(HttpMethod.GET, HttpMethod.POST, 
                                        HttpMethod.PATCH, HttpMethod.DELETE).build();
   }
    
 


    
    //Persona

   @PostMapping ("/persona/new")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    

    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
      
          return persoServ.verPersonas();
    
    }
     
 
    @DeleteMapping ("/persona/delete")
    public void borrarPersona (@RequestParam Long id) {
        persoServ.borrarPersona(id);
    }
     

    @GetMapping ("/persona/buscar")
    @ResponseBody
    public Persona buscarPersona(@RequestParam Long id) {
        return persoServ.buscarPersona(id);
    }
     
    
    @PatchMapping ("/persona/edit")
    public void editarPersona (@RequestBody Persona pers, @RequestParam Long id) {
        persoServ.editarPersona(pers);
    }
    
    // Exps
     
   
     @PostMapping ("/exp/new")
    public void agregarExp (@RequestBody Exp exp) {
        expServ.crearExp(exp);
    }
     

    @GetMapping ("/exp/ver")
    @ResponseBody
    public List<Exp> verExps() {
      
          return expServ.verExps();
    
    }
     

    @DeleteMapping ("/exp/delete")
    public void borrarExp (@RequestParam Long id) {
        expServ.borrarExp(id);
    }
     
   
    @GetMapping ("/exp/buscar")
    @ResponseBody
    public Exp buscarExp(@RequestParam Long id) {
        return expServ.buscarExp(id);
    }
     

    @PatchMapping ("/exp/edit")
    public void editarExp (@RequestBody Exp exp, @RequestParam Long id) {
        expServ.editarExp(exp);
    }
    
    //Edu
     

     @PostMapping ("/edu/new")
    public void agregarEdu (@RequestBody Edu edu) {
        eduServ.crearEdu(edu);
    }
     
 
    @GetMapping ("/edu/ver")
    @ResponseBody
    public List<Edu> verEdus() {
      
          return eduServ.verEdus();
    
    }
     

    @DeleteMapping ("/edu/delete")
    public void borrarEdu (@RequestParam Long id) {
        eduServ.borrarEdu(id);
    }
     
 
    @GetMapping ("/edu/buscar")
    @ResponseBody
    public Edu buscarEdu(@RequestParam Long id) {
        return eduServ.buscarEdu(id);
    }
     

    @PatchMapping ("/edu/edit")
    public void editarEdu (@RequestBody Edu edu, @RequestParam Long id) {
        eduServ.editarEdu(edu);
    }
    
    //Skills
     

       @PostMapping ("/skill/new")
    public void agregarSkill (@RequestBody Skills skill) {
        skillServ.crearSkill(skill);
    }
     

    @GetMapping ("/skill/ver")
    @ResponseBody
    public List<Skills> verSkills() {
      
          return skillServ.verSkills();
    
    }
     

    @DeleteMapping ("/skill/delete")
    public void borrarSkill (@RequestParam Long id) {
        skillServ.borrarSkill(id);
    }
     
  
    @GetMapping ("/skill/buscar")
    @ResponseBody
    public Skills buscarSkill(@RequestParam Long id) {
        return skillServ.buscarSkill(id);
    }
     
    
    @PatchMapping ("/skill/edit")
    public void editarSkill (@RequestBody Skills skill, @RequestParam Long id) {
        skillServ.editarSkill(skill);
    }
    
    //Proyectos
    
    
    
       @PostMapping ("/proyecto/new")
    public void agregarProyecto (@RequestBody Proyecto proy) {
        proyServ.crearProyecto(proy);
    }
     
   
    @GetMapping ("/proyecto/ver")
    @ResponseBody
    public List<Proyecto> verProyectos() {
      
          return proyServ.verProyectos();
    
    }
     
   
    @DeleteMapping ("/proyecto/delete")
    public void borrarProyecto (@RequestParam Long id) {
        proyServ.borrarProyecto(id);
    }
     
   
    @GetMapping ("/proyecto/buscar")
    @ResponseBody
    public Proyecto buscarProyecto(@RequestParam Long id) {
        return proyServ.buscaProyecto(id);
    }
     
    
    @PatchMapping ("/proyecto/edit")
    public void editarProyecto (@RequestBody Proyecto proy, @RequestParam Long id) {
        proyServ.editarProyecto(proy);
    }
    
    
    // Contactos
    
    @PostMapping ("/contacto/new")
    public void agregarContacto (@RequestBody Contacto contacto) {
        contServ.crearContacto(contacto);
    }
    
    @GetMapping ("/contacto/ver")
    @ResponseBody
    public List<Contacto> verContactos() {
        
        return contServ.verContactos();

    }
    
    @DeleteMapping ("/contacto/delete")
    public void borrarContacto (@RequestParam Long id) {
        contServ.eliminarContacto(id);
    }
    
    @GetMapping ("/contacto/buscar")
    @ResponseBody
    public Contacto buscarContacto (@RequestParam Long id) {
        return contServ.buscarContacto(id);
    }
    
    @PatchMapping ("/contacto/edit")
    public void editarContacto (@RequestBody Contacto contacto, @RequestParam Long id) {
        contServ.editarContacto(contacto);
    }
    
    
    
    
    
    // tipo trabajo
//    
//        @PostMapping ("/new/tipo")
//    public void agregarTipo (@RequestBody Tipo_trabajo tipo) {
//        tipoServ.crearTipo(tipo);
//    }
//    
//    @GetMapping ("/ver/tipos")
//    @ResponseBody
//    public List<Tipo_trabajo> verTipos() {
//      
//          return tipoServ.verSkills();
//    
//    }
//    
//    @DeleteMapping ("/delete/tipo")
//    public void borrarTipo (@RequestParam Long id) {
//        tipoServ.borrarTipo(id);
//    }
//    
//    @GetMapping ("buscar/tipo")
//    @ResponseBody
//    public Tipo_trabajo buscarTipo(@RequestParam Long id) {
//        return tipoServ.buscarTipo(id); 
//    }
//    
//    @PutMapping ("/edit/tipo")
//    public void editarTipo (@RequestBody Tipo_trabajo tipo) {
//     
//          tipoServ.editarTipo(tipo);
//    }
//    
//    
    
}
