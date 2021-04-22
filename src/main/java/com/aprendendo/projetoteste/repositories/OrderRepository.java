package com.aprendendo.projetoteste.repositories;

import com.aprendendo.projetoteste.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
