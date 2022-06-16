package com.candidate.task.converter;

import com.candidate.task.domain.User;
import com.candidate.task.exception.UserNotFoundException;
import com.candidate.task.model.UserResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Класс конвертирует ответ от сервиса (она же entity) в модель,
 * которую мы возвращаем на контроллер.
 * Проверка исключения добавлена на всякий случай, если бы Сервис мог возвращать не полные данные.
 * Данная обработка ошибки может показаться излишней, так как при данной задаче, она никогда не выполнится.
 */

@Component
public class UserResponseConverter implements Converter<User, UserResponse> {

    @Override
    public UserResponse convert(User source) {
        UserResponse user = new UserResponse();
        try {
            Optional.of(source)
                    .filter(u -> u.getFio() != null && !u.getFio().isBlank())
                    .filter(u -> u.getId() != 0 && u.getId() != null)
                    .ifPresent(u -> {
                        user.setId(u.getId());
                        user.setFullName(u.getFio());
                    });
            return user;
        } catch (RuntimeException ex) {
            throw new UserNotFoundException("user not found");
        }
    }
}
