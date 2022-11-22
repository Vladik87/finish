package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("  ", " ");
        return "index";
    }

    @GetMapping(value = "/enter")
    public String enter(Model model) {
        model.addAttribute("  ", " ");
        return "enter";
    }

    @PostMapping(value = "/enter")
    public String login(@RequestParam String name, @RequestParam String password, Model model) {
        var userDto = new UserDto();
        userDto.setName(name);
        userDto.setPassword(password);
        if ( name != null ) {

            return "enter";
        }
        if ( userDto.getName().equals(name) && userDto.getPassword().equals(password) ) {
            return "user";
        }

        return "user";
    }

    @PostMapping(value = "/user")
    public String vlad(@RequestParam String name, @RequestParam String password, Model model) {

        if ( name == "vlad" && password == "qwerty1" ) {
            return "user";
        }

        return "user";

    }

//    @Autowired
//    private UserServiceImpl userService;
//
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("userForm", new UserDto());
//        return "registration";
//    }
//    @PostMapping("/registration")
//    public String addUser(@ModelAttribute("userForm") @Validated User userForm, BindingResult bindingResult, Model model) {
//
//        if ( bindingResult.hasErrors() ) {
//            return "registration";
//        }
//        if ( !userForm.getPassword().equals(userForm.getPasswordConfirm()) ) {
//            model.addAttribute("password", "Пароли не совпадают");
//            return "registration";
//        }
//        if ( !userService.saveUser(userForm)){
//            model.addAttribute("usernameError","Пользователь с таким именем уже существует");
//            return "registration";
//        }
//        return "redirect:/";
//    }
}
