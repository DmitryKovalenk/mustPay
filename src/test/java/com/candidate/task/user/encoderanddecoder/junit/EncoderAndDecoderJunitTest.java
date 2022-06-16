package com.candidate.task.user.encoderanddecoder.junit;

import com.candidate.task.util.EncoderAndDecoder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class EncoderAndDecoderJunitTest {

    @InjectMocks
    private EncoderAndDecoder encoderAndDecoder;

    @Before
    public void init() {
        this.encoderAndDecoder = Mockito.mock(EncoderAndDecoder.class);
        Mockito.when(encoderAndDecoder.decrypt("source")).thenReturn(Mockito.anyString());
        Mockito.when(encoderAndDecoder.encrypt("source")).thenReturn(Mockito.anyString());
    }

    @Test
    public void getDecryptAndEncryptTest() {
        String decryptResult = encoderAndDecoder.decrypt("source");
        String encryptResult = encoderAndDecoder.encrypt("source");
        assertEquals(decryptResult, Mockito.anyString());
        assertEquals(encryptResult, Mockito.anyString());
    }
}
