package com.survey.survey.auth.infrastructure.controllers;

import java.util.List;
import java.util.Optional;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.survey.auth.application.services.IUserService;
import com.survey.survey.auth.domain.entities.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    public List<User> listUsers(){
        return iUserService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> showUser(@PathVariable Long id){
        return iUserService.findById(id);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.created(URI.create("/user/userID")).body(iUserService.save(user));
    }
    
}
