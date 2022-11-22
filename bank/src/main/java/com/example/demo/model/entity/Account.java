package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer number;
    @Column
    private Integer amount;
    @Column
    private Integer block;

    @OneToMany(mappedBy = "account")
    private List<CreditCard> creditCard;

    public Account(){}

    public Account(Integer id, Integer number, Integer amount, List<CreditCard> creditCard) {
        this.id = id;
        this.number = number;
        this.amount = amount;
        this.creditCard = creditCard;
    }
}

