package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String transaction;
    @Column
    private String status;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Account> accounts;
}
