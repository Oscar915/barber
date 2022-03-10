package com.back.barber.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.rol;
import com.back.barber.services.RolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    RolService rolService;


    @GetMapping
    public ArrayList<rol> getRoles(){
       return this.rolService.getRoles();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody rol r){
        
         this.rolService.setRoles(r); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó el rol correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }

    
}
