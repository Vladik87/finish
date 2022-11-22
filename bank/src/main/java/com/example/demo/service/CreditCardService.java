package com.example.demo.service;

import com.example.demo.model.entity.CreditCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CreditCardService {
    List<CreditCard> getCreditCard(Integer id) ;
}
