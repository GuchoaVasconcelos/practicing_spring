package com.aprendendo.projetoteste.config;


import com.aprendendo.projetoteste.entities.Order;
import com.aprendendo.projetoteste.entities.User;
import com.aprendendo.projetoteste.repositories.OrderRepository;
import com.aprendendo.projetoteste.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Carlos Alberto", "carlos@gmail.com", "8899966575", "123456");
        User u2 = new User(null, "Gabriel Uchoa", "gabriel@gmail.com", "8899966576", "1234567");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T18:45:55Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
