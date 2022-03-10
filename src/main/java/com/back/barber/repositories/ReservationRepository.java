package com.back.barber.repositories;
import com.back.barber.models.reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<reservation,Long>{
    
}
