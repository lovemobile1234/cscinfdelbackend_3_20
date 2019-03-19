package com.jo.cscinfdel.repository;

import com.jo.cscinfdel.model.Agresor;
import com.jo.cscinfdel.model.Libadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgresorRepository extends
        JpaRepository<Agresor, Integer>,
        PagingAndSortingRepository<Agresor, Integer>,
        QuerydslPredicateExecutor<Agresor> {


}
