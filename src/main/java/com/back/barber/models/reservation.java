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


public class reservation implements Serializable{
   
    Long id;

 
    user user;
    

    service service;

    Date create_date;
    char state;
    Date attend_date;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    public service getService() {
        return service;
    }
    public void setService(service service) {
        this.service = service;
    }
    public Date getCreate_date() {
        return create_date;
    }
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
    public char getState() {
        return state;
    }
    public void setState(char state) {
        this.state = state;
    }
    public Date getAttend_date() {
        return attend_date;
    }
    public void setAttend_date(Date attend_date) {
        this.attend_date = attend_date;
    }

    

}
