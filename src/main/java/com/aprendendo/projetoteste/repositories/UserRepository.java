package com.aprendendo.projetoteste.repositories;

import com.aprendendo.projetoteste.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
