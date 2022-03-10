package com.back.barber.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.user;
import com.back.barber.services.UserService;
import com.back.barber.utils.BCrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping
    public ArrayList<user> getUsers(){
       return this.userService.getUsers();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody user r){
         r.setPassword(BCrypt.hashpw(r.getPassword(), BCrypt.gensalt()));
         this.userService.setUser(r); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó el user correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }
}
