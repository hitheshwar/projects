package com.example.SpeakingClock.controller;

import com.example.SpeakingClock.service.SpeakingClockServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpeakingClockControllerTest {

    @Mock
    private SpeakingClockServiceImpl speakingClockService;

    @InjectMocks
    private SpeakingClockController speakingClockController;

    @Test
    void convertTimeToWords_ValidInput_CallsServiceMethod() {
        when(speakingClockService.convertTimeToWords(anyString())).thenReturn("It's test");
        speakingClockController.convertTimeToWords("08:34");
        verify(speakingClockService).convertTimeToWords("08:34");
    }

    @Test
    void handleUserInput_ValidInput_CallsServiceMethod() {
        when(speakingClockService.convertTimeToWords(anyString())).thenReturn("It's test");
        speakingClockController.handleUserInput("11:25");
        verify(speakingClockService).convertTimeToWords("11:25");
    }
}