package com.example.demo.controller;

import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PaymentsController {

    private final AccountService service;

    @GetMapping("/payments")
    public String payment(Model model) {
        model.addAttribute("", "");
        return "payments";
    }

    @GetMapping("/refill")
    public String refill(Model model) {
        model.addAttribute("", "");
        return "refill";
    }

//    @PostMapping("/refill")
//    public String refill(@RequestParam String )

    @GetMapping("/transfer")
    public String transfer(Model model) {
        model.addAttribute(" ", " ");
        return "transfer";
    }

//    @PostMapping("/transfer")
//    public String transfer(Model model) {
//
//    }
    @GetMapping("/removing")
    public String removing(Model model){
        model.addAttribute(""," ");
        return "removing";
    }

//    @PostMapping("/removing")
//    public String removing(){
//
//    }
//
}
