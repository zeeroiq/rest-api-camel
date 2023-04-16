/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.rest.api.service.impl;

import com.shri.camel.rest.api.model.User;
import com.shri.camel.rest.api.repository.UserRepository;
import com.shri.camel.rest.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.shri.camel.rest.util.Utility.listOfNullProperties;

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

    @Override
    public User findUserByEmailId(String emailId) {
        return userRepository.findByEmailId(emailId).orElseThrow(RuntimeException::new);
    }

    @Override
    public User addUser(User user) {
        User dbUser = userRepository.findByEmailId(user.getEmailId()).orElseThrow(RuntimeException::new);
        BeanUtils.copyProperties(user, dbUser, listOfNullProperties(user));
        return userRepository.save(user);
    }
}
