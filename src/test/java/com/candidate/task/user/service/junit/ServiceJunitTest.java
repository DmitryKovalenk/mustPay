package com.candidate.task.user.service.junit;

import com.candidate.task.domain.User;
import com.candidate.task.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ServiceJunitTest {

    @InjectMocks
    private UserService userService;
    @Mock
    private User user;

    @Before
    public void init() {
        this.userService = Mockito.mock(UserService.class);
        this.user = Mockito.mock(User.class);
        Mockito.when(userService.getClient(Mockito.anyInt())).thenReturn(user);
    }

    @Test
    public void getUserTest() {
        User user = userService.getClient(Mockito.anyInt());
        assertEquals(user, this.user);
    }
}
