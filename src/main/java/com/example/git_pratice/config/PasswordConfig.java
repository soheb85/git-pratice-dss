package com.example.git_pratice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder(12);
    }
}
