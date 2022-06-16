package com.candidate.task.user.component.junit;

import com.candidate.task.component.UserComponent;
import com.candidate.task.model.UserRequest;
import com.candidate.task.model.UserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

public class UserComponentJunitTest {

    @InjectMocks
    private UserComponent userComponent;
    @Mock
    private UserResponse userResponse;
    @Mock
    private UserRequest userRequest;

    @BeforeEach
    public void init() throws JsonProcessingException {
        this.userComponent = Mockito.mock(UserComponent.class);
        this.userRequest = Mockito.mock(UserRequest.class);
        this.userResponse = Mockito.mock(UserResponse.class);
        when(userComponent.getUser(userRequest)).thenReturn(userResponse);
    }

    @Test
    public void getUserTest() throws JsonProcessingException {
        UserResponse response = userComponent.getUser(userRequest);
        assertThat(response).isEqualTo(userResponse);
    }
}
