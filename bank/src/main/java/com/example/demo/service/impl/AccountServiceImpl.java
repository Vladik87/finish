package com.example.demo.service.impl;
import com.example.demo.model.repository.AccountRepository;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

    @Service
    @RequiredArgsConstructor
    public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

}
