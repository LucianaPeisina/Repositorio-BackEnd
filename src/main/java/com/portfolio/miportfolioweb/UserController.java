
package com.portfolio.miportfolioweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luciana
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/save")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
    String id = userService.addUser(userDTO);
    return id;
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse=userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
        
    }        
}
