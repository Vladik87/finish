package com.example.demo.service.impl;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.entity.Account;
import com.example.demo.model.repository.AccountRepository;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;



    @Override
    public List<AccountDto> getAccount() {
        return null;
    }

    @Override
    public AccountDto getAccount(Integer id) {
        var account = repository.getReferenceById(id);

        var accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setAmount(account.getAmount());
        accountDto.setNumber(account.getNumber());
        return accountDto;
    }

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        return accountDto;
    }

    @Override
    public AccountDto findByNumber(Integer number) {
        Account account = repository.findByNumber(number);
        return null;
    }

    @Override
    public List<AccountDto> findAll() {
        return null;
    }


}

