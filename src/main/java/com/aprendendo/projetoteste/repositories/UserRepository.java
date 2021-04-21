package com.aprendendo.projetoteste.repositories;

import com.aprendendo.projetoteste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
