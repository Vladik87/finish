package com.example.demo.service.impl;

import com.example.demo.model.entity.CreditCard;
import com.example.demo.model.repository.CreditCardRepository;
import com.example.demo.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {
    public CreditCardRepository repository;

    public List<CreditCard> getCreditCard(Integer id){
        return repository.findAll();
    }
}
