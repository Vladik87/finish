package com.example.demo.controller;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("  ", " ");
        return "index";
    }

    @GetMapping(value = "/enter.html")
    public String enter(Model model) {
        model.addAttribute("  ", " ");
        return "enter";
    }

}
