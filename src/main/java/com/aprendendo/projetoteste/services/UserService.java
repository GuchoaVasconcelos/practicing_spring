package com.aprendendo.projetoteste.services;

import com.aprendendo.projetoteste.entities.User;
import com.aprendendo.projetoteste.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
