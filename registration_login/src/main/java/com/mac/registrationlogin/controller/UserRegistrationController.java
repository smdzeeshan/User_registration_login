package com.mac.registrationlogin.controller;

import com.mac.registrationlogin.dto.UserRegistrationDto;
import com.mac.registrationlogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        return userRegistrationDto;
    }

    @GetMapping()
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping()
    public String registerUserAccount(@ModelAttribute ("user") UserRegistrationDto userRegistrationDto){
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }




}
