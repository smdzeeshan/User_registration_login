package com.mac.registrationlogin.service;

import com.mac.registrationlogin.dto.UserRegistrationDto;
import com.mac.registrationlogin.entity.Role;
import com.mac.registrationlogin.entity.User;
import com.mac.registrationlogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {

        User user = new User(userRegistrationDto.getFirstname(), userRegistrationDto.getLastname(), userRegistrationDto.getEmail(),
                userRegistrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        userRepository.save(user);
        return user;
    }
}
