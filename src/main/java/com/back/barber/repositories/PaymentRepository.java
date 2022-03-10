package com.back.barber.repositories;

import com.back.barber.models.payment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PaymentRepository extends CrudRepository<payment,Long>{
    
}
