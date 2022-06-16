package com.candidate.task.converter;

import com.candidate.task.exception.UserNotFoundException;
import com.candidate.task.model.UserRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Конвертирует запрос, который пришел с контроллера в Component (где мы описываем бизнес логику)
 * В реальной жизни вряд ли была бы проверка на то, что id клиента == 1
 * В реальном кейсе, такая ошибка предусмотрелась бы на сервисе или же на конверторе, который принимает сущность сервиса
 * и конвертирует ее в модель, которую мы вернем на контроллер.
 */

@Component
public class UserRequestConverter implements Converter<UserRequest, Integer> {

    @Override
    public Integer convert(UserRequest source) {
        return Optional.of(source)
                .map(UserRequest::getId)
                .filter(i -> {
                    if (i != 1) {
                     throw new UserNotFoundException(String.format("user with id: %s not found", i));
                    } else {
                        return true;
                    }
                })
                .orElseThrow(() -> new UserNotFoundException("id must not be null"));
    }
}
