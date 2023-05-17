package com.xbrainapi.api.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
public class Sale {
    private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;      //responsabilizando o BD pelo incremento do ID
    private @CreationTimestamp LocalDate createdAt;     
    private float amount;
    @ManyToOne(cascade = {CascadeType.ALL}) 
    @JoinColumn(name="salesman_id") 
    private Salesman salesman;  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @JsonBackReference
    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }
}