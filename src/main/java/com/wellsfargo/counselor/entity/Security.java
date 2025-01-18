package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private Integer sid;
    private String name;
    private String category;
    private LocalDate purchaseDate;
    private Double purchasePrice;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    public Security(Integer sid, String name, LocalDate purchaseDate, String category, Double purchasePrice) {
        this.sid = sid;
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.category = category;
        this.purchasePrice = purchasePrice;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}

