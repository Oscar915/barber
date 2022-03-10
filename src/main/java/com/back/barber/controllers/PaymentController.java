package com.back.barber.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.back.barber.models.payment;
import com.back.barber.services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;


    @GetMapping
    public ArrayList<payment> getPayments(){
       return this.paymentService.getPayments();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> guardar (@RequestBody payment p){
        
         this.paymentService.setPayment(p); 
         Map<String, String> respuesta=new HashMap<>();
         respuesta.put("mensaje", "Se agregó el pago correctamente"); 
         respuesta.put("estado", "true");
         return ResponseEntity.ok(respuesta); 
     }
}
