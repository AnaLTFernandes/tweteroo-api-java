package com.api.tweteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.tweteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Query("FROM Tweet tweet WHERE tweet.username = :username")
    public List<Tweet> findByUsernameEquals(@Param("username") String username);
}
