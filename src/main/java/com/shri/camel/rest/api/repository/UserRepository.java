package com.shri.camel.rest.api.repository;

import com.shri.camel.rest.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);
    List<User> findAll();

}
