package com.balance.service;

import com.balance.model.EscalerasHistorial;
import com.balance.repository.EscalerasHistorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by da_20 on 19/6/2017.
 */

public interface EscalerasHistorialService {


    void saveEscaleraHistorial(EscalerasHistorial escalerasHistorial);
    Iterable<EscalerasHistorial> listAllEscalerasHistorial();
    EscalerasHistorial getEscaleraHistorialById(Integer id);
    void deleteEscaleraHistorial(Integer id);
}
