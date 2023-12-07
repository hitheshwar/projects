package com.example.SpeakingClock.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeakingClockServiceTest {

    private final SpeakingClockService speakingClockService = new SpeakingClockServiceImpl();

    @Test
    void convertTimeToWords_ValidInput_ReturnsCorrectWords() {
        String result = speakingClockService.convertTimeToWords("08:34");
        assertEquals("It's eight thirty-four", result);
    }

    @Test
    void convertTimeToWords_Midday_ReturnsMidday() {
        String result = speakingClockService.convertTimeToWords("12:00");
        assertEquals("It's Midday", result);
    }

    @Test
    void convertTimeToWords_Midnight_ReturnsMidnight() {
        String result = speakingClockService.convertTimeToWords("00:00");
        assertEquals("It's Midnight", result);
    }

}