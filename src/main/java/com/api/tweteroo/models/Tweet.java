package com.api.tweteroo.models;

import com.api.tweteroo.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Tweets")
public class Tweet {

    public Tweet(TweetDTO user, String avatar) {
        this.username = user.username();
        this.text = user.tweet();
        this.avatar = avatar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30, nullable = false)
    private String username;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String avatar;
}
