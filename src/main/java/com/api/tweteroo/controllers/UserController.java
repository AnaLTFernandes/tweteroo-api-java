package com.api.tweteroo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.UserDTO;
import com.api.tweteroo.services.UserService;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/auth/sign-up")
    public ResponseEntity<String> create(@RequestBody @Valid UserDTO user) {
        service.create(user);

        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>("Ok", responseHeaders, HttpStatus.CREATED);
    }
}
