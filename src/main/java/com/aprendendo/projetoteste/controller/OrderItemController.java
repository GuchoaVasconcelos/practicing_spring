package com.aprendendo.projetoteste.controller;


import com.aprendendo.projetoteste.entities.OrderItem;
import com.aprendendo.projetoteste.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/OrdemItems")
public class OrderItemController {

    @Autowired
    private OrderItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll(){
        List<OrderItem> items = service.findAll();
        return ResponseEntity.ok().body(items);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long id){
        OrderItem item = service.findById(id);
        return ResponseEntity.ok().body(item);
    }
}
