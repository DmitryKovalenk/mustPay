package com.candidate.task.service;

import com.candidate.task.domain.User;
import org.springframework.stereotype.Service;


/**
 * Сервис максимально простой, имитирует "поход" на endpoint вне приложения,
 * либо же какую-то логику, которая не связана с вызовом endpoint.
 */

@Service
public class UserService {

    public User getClient(Integer clientId) {
        return new User(clientId, "Test Tesov");
    }
}
