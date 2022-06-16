package com.candidate.task.user.converter.junit;

import com.candidate.task.converter.UserRequestConverter;
import com.candidate.task.model.UserRequest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

public class UserRequestConverterJunitTest {

    @InjectMocks
    private UserRequestConverter userRequestConverter;
    @Mock
    private UserRequest userRequest;


    @Before
    public void init() {
        this.userRequestConverter = Mockito.mock(UserRequestConverter.class);
        this.userRequest = Mockito.mock(UserRequest.class);
        Mockito.when(userRequestConverter.convert(userRequest)).thenReturn(Mockito.anyInt());
    }

    @Test
    public void convertTest() {
        Integer anyInt = userRequestConverter.convert(userRequest);
        assertEquals(anyInt, Integer.valueOf(Mockito.anyInt()));
    }
}
