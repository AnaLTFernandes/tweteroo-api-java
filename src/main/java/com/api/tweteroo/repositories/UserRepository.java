package com.api.tweteroo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.tweteroo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("FROM User user WHERE user.username = :username")
    public List<User> findByUsernameEquals(@Param("username") String username);
}
