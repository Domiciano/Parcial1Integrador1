package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.Product;
import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.repositories.ProductRepository;
import edu.co.icesi.banner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(value = "products/create", consumes = "application/json")
    public ResponseEntity<?> create(@RequestBody Product product){
        productRepository.save(product);
        return ResponseEntity.status(200).body("Done");
    }




}
