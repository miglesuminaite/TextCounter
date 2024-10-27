package com.example.textcounter.utils;

public class TextCounter {

    public static int getCharsCount(String inputPhrase){
        return inputPhrase.length();
    }

    public static int getWordsCount(String inputPhrase){
        if (inputPhrase.isEmpty()) {
            return 0;
        }

        String[] words = inputPhrase.trim().split("\\s+");
        return words.length;
    }
}
