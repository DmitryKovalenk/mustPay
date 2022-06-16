package com.candidate.task.component;

import com.candidate.task.converter.UserRequestConverter;
import com.candidate.task.converter.UserResponseConverter;
import com.candidate.task.domain.User;
import com.candidate.task.model.UserRequest;
import com.candidate.task.model.UserResponse;
import com.candidate.task.service.UserService;
import com.candidate.task.util.EncoderAndDecoder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Данный класс был создан осознано, для реализации бизнес-логики.
 */

@Component
@Slf4j
public class UserComponent {

    private final UserService userService;
    private final UserRequestConverter userRequestConverter;
    private final EncoderAndDecoder encoderAndDecoder;
    private final UserResponseConverter userResponseConverter;

    public UserComponent(UserService userService,
                         UserRequestConverter userRequestConverter,
                         EncoderAndDecoder encoderAndDecoder,
                         UserResponseConverter userResponseConverter) {
        this.userService = userService;
        this.userRequestConverter = userRequestConverter;
        this.encoderAndDecoder = encoderAndDecoder;
        this.userResponseConverter = userResponseConverter;
    }

    public UserResponse getUser(UserRequest request) throws JsonProcessingException {
        User client = userService.getClient(userRequestConverter.convert(request));
        String encodedValue = encode(new ObjectMapper().writeValueAsString(client));
        decode(encodedValue);
        return userResponseConverter.convert(client);
    }


    public String encode(String source) {
        String encryptedValue = encoderAndDecoder.encrypt(source.trim());
        log.info("=== encryption: {}", encryptedValue);
        return encryptedValue;
    }

    public void decode(String source) {
        String decryptedValue = encoderAndDecoder.decrypt(source.trim());
        log.info("=== decryption: {}", decryptedValue);
    }
}
