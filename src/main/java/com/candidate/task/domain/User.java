package com.candidate.task.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Этот класс может показаться бесполезным, так как у нас есть аналогичный UserViewModel. Но UserViewModel - это модель,
 * которая будет возвращаться контроллером для отображения. Этот же класс является сущностью (entity) которая требуется
 * для того, чтобы наш выдуманный сервис смог размапить ответ.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String fio;

}
