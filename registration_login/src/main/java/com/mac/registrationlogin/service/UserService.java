package com.mac.registrationlogin.service;

import com.mac.registrationlogin.dto.UserRegistrationDto;
import com.mac.registrationlogin.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
