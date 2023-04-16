/***********************************************************************************************************************************************************
 ** Created By zeeroiq on 4/17/23, 12:07 AM.
 ** Copyright (c) ZeeroIQ
 *********************************************************************************************************************************************************/

package com.shri.camel.rest.api.repository;

import com.shri.camel.rest.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailId(String emailId);
}
