package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "account", optional = false)
    private CreditCard creditCard;

    }

