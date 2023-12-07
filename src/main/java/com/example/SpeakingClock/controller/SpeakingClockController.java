package com.example.SpeakingClock.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpeakingClock.service.SpeakingClockService;

@RestController
@RequestMapping("/speaking-clock")
public class SpeakingClockController {

    private static final Pattern TIME_PATTERN = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");

	@Autowired
    private SpeakingClockService speakingClockService;

    @GetMapping("/v1/convert")
    public String convertTimeToWords(@RequestParam String time) {
    	if (TIME_PATTERN.matcher(time).matches()) {
            return speakingClockService.convertTimeToWords(time);
        } else {
            return "Invalid time format. Please use the format HH:mm";
        }
    }
    
    @GetMapping("/v2/convert")
    public String handleUserInput(@RequestParam String time) {
        if (TIME_PATTERN.matcher(time).matches()) {
            int hour = Integer.parseInt(time.split(":")[0]);

            if (hour == 12) {
                return "It's Midday";
            } else if (hour == 0) {
                return "It's Midnight";
            } else {
                return speakingClockService.convertTimeToWords(time);
            }
        } else {
            return "Invalid time format. Please use the format HH:mm";
        }
    }
}
