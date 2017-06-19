package com.balance.controller;

import com.balance.model.EscalerasHistorial;
import com.balance.model.LocationHistory;
import com.balance.service.EscalerasHistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by da_20 on 19/6/2017.
 */
@RestController
public class EscalerasHistorialController {
    private EscalerasHistorialService escalerasHistorialService;

    @Autowired
    public void setLocationHistoryService(EscalerasHistorialService escalerasHistorialService) {
        this.escalerasHistorialService = escalerasHistorialService;
    }

    @RequestMapping(value = "/escaleras", method = RequestMethod.GET)
    public ResponseEntity<Iterable<EscalerasHistorial>> getEscalerasHistorial() {
        return new ResponseEntity(escalerasHistorialService.listAllEscalerasHistorial(), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/getEscaleras/{id}", method = RequestMethod.GET)
    public EscalerasHistorial getEscaleras(@PathVariable Integer id) {
        Integer cantidadescalerassubidas = 0;
        Iterator<EscalerasHistorial> iterator = escalerasHistorialService.listAllEscalerasHistorial().iterator();
        List<EscalerasHistorial> myList=new ArrayList<>();
        Date fechaactual = new Date();
        while(iterator.hasNext()){
            myList.add(iterator.next());
        }

        for(EscalerasHistorial lh:myList){
            if(lh.getUser().equals(id) &&
                    fechaactual.getDay()==lh.getDate().getDay() &&
                    fechaactual.getMonth()==lh.getDate().getMonth() &&
                    fechaactual.getYear()==lh.getDate().getYear()){
                    cantidadescalerassubidas+=lh.getCantidad();
            }
        }

        EscalerasHistorial escalerasHistorial = new EscalerasHistorial();
        escalerasHistorial.setCantidad(cantidadescalerassubidas);
        escalerasHistorial.setId(67620L);
        return escalerasHistorial;

    }
}
