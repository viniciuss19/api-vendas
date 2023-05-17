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
    
    private final SalesmanRepository salesmanRepository;
    private final SaleRepository saleRepository;

    public SaleHandler(SaleRepository saleRepository, SalesmanRepository salesmanRepository) {

        this.salesmanRepository = salesmanRepository;
        this.saleRepository = saleRepository;
    }

    @PostMapping
    public Sale createSale(@RequestBody CreateSaleDTO data) {
        Sale newSale = new Sale();

        Salesman salesman = new Salesman();
        salesman.setId(data.salesmanId);
        salesman.setName(data.salesmanName);
        
        newSale.setSalesman(salesman);
        newSale.setAmount(data.amount);
        

        return saleRepository.save(newSale);
    } //metodo jpa pra salvar no banco
}

