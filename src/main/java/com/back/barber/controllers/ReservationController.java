package com.back.barber.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.reservation;
import com.back.barber.services.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;


    @GetMapping
    public ArrayList<reservation> getReservation(){
       return this.reservationService.getReservations();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody reservation r){
        
         this.reservationService.setReservation(r); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó la reservation correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }
}
