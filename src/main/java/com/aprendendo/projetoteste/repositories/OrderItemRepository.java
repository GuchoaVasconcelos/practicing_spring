package com.aprendendo.projetoteste.repositories;

import com.aprendendo.projetoteste.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
