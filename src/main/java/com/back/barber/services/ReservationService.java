package com.back.barber.services;
import java.util.ArrayList;

import com.back.barber.models.reservation;
import com.back.barber.repositories.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    /*
    Este método me permite traer todos las reservaciones que se encuentran en la base de datos
    */
    public ArrayList<reservation> getReservations(){
        return (ArrayList<reservation>) reservationRepository.findAll();
    }

    /**
     * Permite insertar un nueva reservación
     */
    public void setReservation(reservation r){
      this.reservationRepository.save(r);
    }
}
