package com.balance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by da_20 on 19/6/2017.
 */
@Entity
public class EscalerasHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;




    @NotNull
    private Integer cantidad;

    //true si sube, false si baja
    private boolean upanddown;

    private Integer user;
    private Date date;

    public EscalerasHistorial(boolean upanddown, Integer cantidad, Integer user, Date date) {
        this.upanddown = upanddown;
        this.cantidad = cantidad;
        this.user = user;
        this.date = date;
    }

    public EscalerasHistorial() {
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isUpanddown() {
        return upanddown;
    }

    public void setUpanddown(boolean upanddown) {
        this.upanddown = upanddown;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
