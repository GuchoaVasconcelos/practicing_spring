package com.aprendendo.projetoteste.config;


import com.aprendendo.projetoteste.entities.User;
import com.aprendendo.projetoteste.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Carlos Alberto", "carlos@gmail.com", "8899966575", "123456");
        User u2 = new User(null, "Gabriel Uchoa", "gabriel@gmail.com", "8899966576", "1234567");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
