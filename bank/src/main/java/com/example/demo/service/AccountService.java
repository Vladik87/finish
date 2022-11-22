package com.example.demo.service;

import com.example.demo.dto.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<AccountDto> getAccount();

    AccountDto getAccount (Integer id);

    AccountDto saveAccount(AccountDto accountDto);

    AccountDto findByNumber(Integer number);
    List<AccountDto> findAll();
}
