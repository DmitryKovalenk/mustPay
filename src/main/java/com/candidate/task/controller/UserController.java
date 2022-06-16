package com.candidate.task.controller;

import com.candidate.task.component.UserComponent;
import com.candidate.task.domain.User;
import com.candidate.task.model.UserRequest;
import com.candidate.task.model.UserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserComponent component;

    public UserController(UserComponent component) {
        this.component = component;
    }

    @PostMapping("/get")
    public UserResponse getUser(@RequestBody UserRequest request) throws JsonProcessingException {
        return component.getUser(request);
    }
}
