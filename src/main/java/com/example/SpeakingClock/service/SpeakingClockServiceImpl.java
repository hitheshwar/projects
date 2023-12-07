package com.example.SpeakingClock.service;

import org.springframework.stereotype.Service;

import com.example.SpeakingClock.util.NumberToWordsConverter;

@Service
public class SpeakingClockServiceImpl implements SpeakingClockService {

	@Override
    public String convertTimeToWords(String time) {
		String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        String hourInWords = NumberToWordsConverter.convertToWords(hour);
        String minuteInWords = NumberToWordsConverter.convertToWords(minute);

        return "It's " + hourInWords + " " + (minute > 0 ? minuteInWords + " " : "") + (minute == 1 ? "minute" : "minutes");
    }
}
