package com.back.barber.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.service;
import com.back.barber.services.ServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
    @Autowired
    ServiceService serviceService;


    @GetMapping
    public ArrayList<service> getServices(){
       return this.serviceService.getServices();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody service s){
        
         this.serviceService.setService(s); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó el services correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }
}
