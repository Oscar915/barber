package com.back.barber.repositories;

import com.back.barber.models.detail;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends CrudRepository<detail,Long>{
    
}
