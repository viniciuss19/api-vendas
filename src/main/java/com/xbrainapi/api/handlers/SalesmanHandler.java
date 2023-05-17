package com.xbrainapi.api.handlers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.xbrainapi.api.models.Salesman;
import com.xbrainapi.api.repositories.SalesmanRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/salesman")
public class SalesmanHandler {
    private final SalesmanRepository salesmanRepository;

    public SalesmanHandler(SalesmanRepository salesmanRepository) {
        this.salesmanRepository = salesmanRepository;
    }



    @GetMapping
    @Query("SELECT s FROM Salesman s JOIN FETCH s.sales sa WHERE sa.createdAt BETWEEN :startDate AND :endDate")
    public List<Salesman> listSalesman(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,   
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {      //Determinando que é necessário passar as datas por parâmetro para o funcionamento do codigo
        return this.salesmanRepository.findBySalesCreatedAtBetween(startDate, endDate);     //usando metodo do repo do vendedor
    }

    
}