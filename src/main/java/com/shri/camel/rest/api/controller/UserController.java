package com.shri.camel.rest.api.controller;

import com.shri.camel.rest.api.model.User;
import com.shri.camel.rest.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> listAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

}
