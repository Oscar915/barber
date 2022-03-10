package com.back.barber.services;
import java.util.ArrayList;

import com.back.barber.models.user;
import com.back.barber.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    /*
    Este método me permite traer todos los usuarios que se encuentran en la base de datos
    */
    public ArrayList<user> getUsers(){
        return (ArrayList<user>) userRepository.findAll();
    }

    /**
     * Permite insertar un nuevo usuario
     */
    public void setUser(user r){
      this.userRepository.save(r);
    }
}
