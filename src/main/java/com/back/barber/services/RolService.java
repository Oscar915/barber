package com.back.barber.services;

import java.util.ArrayList;

import com.back.barber.models.rol;
import com.back.barber.repositories.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    
    @Autowired
    RolRepository rolRepository;

    /*
    Este método me permite traer todos los roles que se encuentran en la base de datos
    */
    public ArrayList<rol> getRoles(){
        return (ArrayList<rol>) rolRepository.findAll();
    }

    /**
     * Permite insertar un nuevo rol
     */
    public void setRoles(rol r){
      this.rolRepository.save(r);
    }
}
