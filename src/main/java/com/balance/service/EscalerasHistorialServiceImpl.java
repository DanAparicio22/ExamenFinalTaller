package com.balance.service;

import com.balance.model.EscalerasHistorial;
import com.balance.repository.EscalerasHistorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by da_20 on 19/6/2017.
 */
@Service
public class EscalerasHistorialServiceImpl implements EscalerasHistorialService {

    @Autowired
    private EscalerasHistorialRepository escalerasHistorialRepository;

    @Override
    public void saveEscaleraHistorial(EscalerasHistorial escalerasHistorial) {
        escalerasHistorialRepository.save(escalerasHistorial);
    }

    @Override
    public Iterable<EscalerasHistorial> listAllEscalerasHistorial() {
        return escalerasHistorialRepository.findAll();
    }

    @Override
    public EscalerasHistorial getEscaleraHistorialById(Integer id) {
        return escalerasHistorialRepository.findOne(id);
    }

    @Override
    public void deleteEscaleraHistorial(Integer id) {
        escalerasHistorialRepository.delete(id);
    }
}
