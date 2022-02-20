package com.store_server.controller;

import com.store_server.persistence.entity.store.products.Sneaker;
import com.store_server.persistence.repository.products.SneakerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping("/products/sneakers")
public class SneakerController {
    private final SneakerRepository sneakerRepository;

    public SneakerController(SneakerRepository sneakerRepository) {
        this.sneakerRepository = sneakerRepository;
    }

    @GetMapping()
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Sneaker> getSneakers() {
        System.out.println("SneakerController.getSneakers");
        return sneakerRepository.findAll();
    }
}
