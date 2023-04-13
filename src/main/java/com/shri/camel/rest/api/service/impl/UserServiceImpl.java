package com.shri.camel.rest.api.service.impl;

import com.shri.camel.rest.api.model.User;
import com.shri.camel.rest.api.repository.UserRepository;
import com.shri.camel.rest.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
