package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.ObjetoRobadoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoRobadoVehiculoRepository extends
        JpaRepository<ObjetoRobadoVehiculo, Integer>,
        PagingAndSortingRepository<ObjetoRobadoVehiculo, Integer>,
        QuerydslPredicateExecutor<ObjetoRobadoVehiculo> {

}
