package com.candidate.task.user.component.integration;

import com.candidate.task.component.UserComponent;
import com.candidate.task.model.UserRequest;
import com.candidate.task.model.UserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles
public class UserComponentIntegrationTest {

    @Autowired
    private UserComponent userComponent;

    @Test
    public void getUser() throws JsonProcessingException {
        UserResponse user = userComponent.getUser(new UserRequest(1));
        assert user.getFullName() != null && !user.getFullName().isBlank();
    }
}
