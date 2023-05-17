package com.xbrainapi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xbrainapi.api.models.Salesman;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {
    @Query("SELECT s FROM Salesman s LEFT JOIN s.sales sa WHERE (sa.createdAt BETWEEN :startDate AND :endDate) OR sa IS NULL")
    List<Salesman> findBySalesCreatedAtBetween(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    
}