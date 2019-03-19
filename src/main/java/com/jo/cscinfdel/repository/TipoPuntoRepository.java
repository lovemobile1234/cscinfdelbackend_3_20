package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.TipoPunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPuntoRepository extends
        JpaRepository<TipoPunto, Integer>,
        PagingAndSortingRepository<TipoPunto, Integer>,
        QuerydslPredicateExecutor<TipoPunto> {


}
