package com.shri.camel.rest.api.service;

import com.shri.camel.rest.api.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findUserById(Long id);
    List<User> findAll();
}
