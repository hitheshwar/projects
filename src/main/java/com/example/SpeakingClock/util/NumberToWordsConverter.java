package com.example.SpeakingClock.util;

public class NumberToWordsConverter {

	private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String convertToWords(int number) {
        if (number < 0 || number > 59) {
            throw new IllegalArgumentException("Invalid minute or hour value");
        }

        if (number == 0) {
            return "zero";
        }

        if (number < 10) {
            return units[number];
        }

        if (number > 10 && number < 20) {
            return teens[number - 10];
        }

        int tensDigit = number / 10;
        int unitsDigit = number % 10;

        return tens[tensDigit] + (unitsDigit > 0 ? " " + units[unitsDigit] : "");
    }

}
