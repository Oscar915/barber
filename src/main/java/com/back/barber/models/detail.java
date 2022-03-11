package com.back.barber.models;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class detail implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    @ManyToOne
    reservation reservation;

    @ManyToOne
    payment payment;


    Date create_date;
    double cost;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public reservation getReservation() {
        return reservation;
    }
    public void setReservation(reservation reservation) {
        this.reservation = reservation;
    }
    public payment getPayment() {
        return payment;
    }
    public void setPayment(payment payment) {
        this.payment = payment;
    }
    public Date getCreate_date() {
        return create_date;
    }
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    
}
