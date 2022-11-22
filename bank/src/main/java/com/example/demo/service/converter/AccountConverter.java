package com.example.demo.service.converter;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {
    public Account formAccountDtoToAccount(AccountDto accountDto){
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setNumber(accountDto.getNumber());
        account.setAmount(accountDto.getAmount());
        account.setBlock(accountDto.getBlock());
        return account;
    }
    public AccountDto formAccountToAccountDto(Account account){
        return AccountDto.builder()
                .id(account.getId())
                .number(account.getNumber())
                .amount(account.getAmount())
                .block(account.getBlock())
                .build();
    }
}
