package com.xbrainapi.api.DTOs;

public class CreateSaleDTO {
    public float amount;
    public Long salesmanId;
    public String salesmanName;
    
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    

    
    public Long getSalesmanId() {
        return salesmanId;
    }
    public void setSalesmanId(Long salesmanId) {
        this.salesmanId = salesmanId;
    }



    
    public String getSalesmanName() {
        return salesmanName;
    }
    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }
}
