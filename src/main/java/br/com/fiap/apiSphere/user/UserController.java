package br.com.fiap.apiSphere.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/T_SPHERE_USERS")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping
    public List<User> finAll(){
        return service.findAll();
    }
}
