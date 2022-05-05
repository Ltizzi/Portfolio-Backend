package com.Portfolio.Controller;

import com.Portfolio.Model.Role;
import com.Portfolio.Model.User;
import com.Portfolio.Service.UserService;
import java.net.URI;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    
    
    
    @Autowired
    private final UserService userServ;
    
    @CrossOrigin
    @GetMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user(save").toUriString());
        return ResponseEntity.created(uri).body(userServ.saveUser(user));
    
    }
    @CrossOrigin
    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/apu/role/save").toUriString());
        return ResponseEntity.created(uri).body(userServ.saveRole(role));
    } 
    @CrossOrigin
    @PostMapping("/role/addtouser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        userServ.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    
    }
    
}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
