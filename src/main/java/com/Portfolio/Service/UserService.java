
package com.Portfolio.Service;

import com.Portfolio.Model.Role;
import com.Portfolio.Model.User;


public interface UserService {
    
    User saveUser(User user);
    
    Role saveRole(Role role);
    
    void addRoleToUser(String username, String roleName);
    
    User getUser(String username);
    
    
    
}
