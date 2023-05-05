package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.User;
import edu.co.icesi.banner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "users/create", consumes = "application/json")
    public ResponseEntity<?> create(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.status(200).body("Done");
    }




}
