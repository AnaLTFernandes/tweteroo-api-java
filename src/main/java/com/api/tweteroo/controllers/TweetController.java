package com.api.tweteroo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tweteroo.dto.TweetDTO;
import com.api.tweteroo.models.Tweet;
import com.api.tweteroo.services.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
    @Autowired
    private TweetService service;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody @Valid TweetDTO tweet) {
        HttpHeaders responseHeaders = new HttpHeaders();

        try {
            service.create(tweet);
            return new ResponseEntity<>("Ok", responseHeaders, HttpStatus.CREATED);
        } catch (NotFoundException e) {
            return new ResponseEntity<>("Usuário não encontrado!", responseHeaders, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<Tweet>> listByUsersname(@PathVariable String username) {
        HttpHeaders responseHeaders = new HttpHeaders();
        List<Tweet> tweets = service.findByUsernameEquals(username);
        return new ResponseEntity<>(tweets, responseHeaders, HttpStatus.OK);
    }
}
