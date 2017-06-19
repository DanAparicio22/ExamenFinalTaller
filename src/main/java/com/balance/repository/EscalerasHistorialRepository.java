package com.balance.repository;

import com.balance.model.EscalerasHistorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by da_20 on 19/6/2017.
 */
@Repository
public interface EscalerasHistorialRepository extends JpaRepository<EscalerasHistorial, Integer> {
}
