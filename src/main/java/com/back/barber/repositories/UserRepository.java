package com.back.barber.repositories;

import com.back.barber.models.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<user,Long>{
    
}
