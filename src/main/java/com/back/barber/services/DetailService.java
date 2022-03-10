package com.back.barber.services;
import java.util.ArrayList;

import com.back.barber.models.detail;
import com.back.barber.repositories.DetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
    @Autowired
    DetailRepository detailRepository;

    /*
    Este método me permite traer todos los roles que se encuentran en la base de datos
    */
    public ArrayList<detail> getDetails(){
        return (ArrayList<detail>) detailRepository.findAll();
    }

    /**
     * Permite insertar un nuevo rol
     */
    public void setDetail(detail r){
      this.detailRepository.save(r);
    }
}
