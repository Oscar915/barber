package com.back.barber.repositories;
import com.back.barber.models.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<service,Long>{
    
}
