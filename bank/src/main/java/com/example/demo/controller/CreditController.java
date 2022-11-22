package com.example.demo.controller;

import com.example.demo.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CreditController {
    private final CreditCardService creditCardService;

    @GetMapping(value = "/cards")
    public String getCreditCard( Model model){



        return "cards";

    }
}
