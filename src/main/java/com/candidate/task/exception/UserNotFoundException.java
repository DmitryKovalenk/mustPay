package com.candidate.task.exception;

/**
 * Ошибка будет "брошена" если мы не найдем пользователя по указанному id
 */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String error) {
        super(error);
    }
}
