package com.back.barber.services;
import java.util.ArrayList;

import com.back.barber.models.payment;
import com.back.barber.repositories.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    @Autowired
    PaymentRepository paymentService;

    /*
    Este método me permite traer todos los pagos que se encuentran en la base de datos
    */
    public ArrayList<payment> getPayments(){
        return (ArrayList<payment>) paymentService.findAll();
    }

    /**
     * Permite insertar un nuevo pago
     */
    public void setPayment(payment p){
      this.paymentService.save(p);
    }
}
