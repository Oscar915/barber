package com.back.barber.services;
import java.util.ArrayList;

import com.back.barber.models.service;
import com.back.barber.repositories.ServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    /*
    Este método me permite traer todos los servicios que se encuentran en la base de datos
    */
    public ArrayList<service> getServices(){
        return (ArrayList<service>) serviceRepository.findAll();
    }

    /**
     * Permite insertar un nuevo servicio
     */
    public void setService(service s){
      this.serviceRepository.save(s);
    }
}
