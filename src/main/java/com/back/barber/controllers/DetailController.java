package com.back.barber.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.detail;
import com.back.barber.services.DetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", methods= {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api/detail")
public class DetailController {
    @Autowired
    DetailService detailService;


    @GetMapping
    public ArrayList<detail> getDetails(){
       return this.detailService.getDetails();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody detail d){
        
         this.detailService.setDetail(d); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó el details correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }
}
