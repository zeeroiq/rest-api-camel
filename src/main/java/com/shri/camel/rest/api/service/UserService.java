/***********************************************************************************************************************************************************
 ** Created By zeeroiq on 4/17/23, 12:07 AM.
 ** Copyright (c) ZeeroIQ
 *********************************************************************************************************************************************************/

package com.shri.camel.rest.api.service;

import com.shri.camel.rest.api.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findUserById(Long id);
    List<User> findAll();
    User findUserByEmailId(String emailId);

    User addUser(User user);
}
