package com.xbrainapi.api.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Salesman {
    private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
    private String name;

    @OneToMany(mappedBy = "salesman")
    private List<Sale> sales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonManagedReference
    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}