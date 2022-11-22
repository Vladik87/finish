package com.example.demo.controller;

import com.example.demo.dto.AccountDto;
import com.example.demo.model.entity.Account;
import com.example.demo.model.repository.AccountRepository;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @Autowired
    private AccountRepository repository;

    @GetMapping(value = "/accounts")
    public String getAccount(Model model) {
        Iterable<Account> Accounts = repository.findAll();
        model.addAttribute("Accounts", Accounts);
        return "accounts";
    }
}
