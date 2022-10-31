package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class CreditCard {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer number;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Account account;

}
