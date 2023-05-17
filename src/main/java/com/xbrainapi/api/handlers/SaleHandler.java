package com.xbrainapi.api.handlers;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xbrainapi.api.DTOs.CreateSaleDTO;
import com.xbrainapi.api.models.Sale;
import com.xbrainapi.api.models.Salesman;
import com.xbrainapi.api.repositories.*;



@RestController
@RequestMapping("/sale")
public class SaleHandler {
    private final SaleRepository saleRepository;
    private final SalesmanRepository salesmanRepository;

    public SaleHandler(SaleRepository saleRepository, SalesmanRepository salesmanRepository) {
        this.saleRepository = saleRepository;
        this.salesmanRepository = salesmanRepository;
    }

    @PostMapping
    public Salesman createSale(@RequestBody CreateSaleDTO data) {
       Sale newSale = new Sale();
       Optional<Salesman> salesmantest = salesmanRepository.findById(data.salesmanId);
       Salesman salesman = salesmantest.orElseThrow();
        salesman.setName(data.getSalesmanName());
        salesman.setId(data.getSalesmanId());
       newSale.setAmount(data.amount);
       newSale.setSalesman(salesman);

       return salesmanRepository.save(salesman);
}
}
