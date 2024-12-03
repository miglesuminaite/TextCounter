package com.example.textcounter;

import org.junit.Test;
import static org.junit.Assert.*;

import com.example.textcounter.utils.TextCounter;

public class TextCounterTest {

    @Test
    public void testGetCharsCount_emptyString() {
        String input = "";
        int result = TextCounter.getCharsCount(input);
        assertEquals(0, result);
    }

    @Test
    public void testGetCharsCount_spacesOnly() {
        String input = "     ";
        int result = TextCounter.getCharsCount(input);
        assertEquals(5, result);
    }

    @Test
    public void testGetCharsCount_normalText() {
        String input = "Hello World!";
        int result = TextCounter.getCharsCount(input);
        assertEquals(12, result);
    }

    @Test
    public void testGetWordsCount_emptyString() {
        String input = "";
        int result = TextCounter.getWordsCount(input);
        assertEquals(0, result);
    }

    @Test
    public void testGetWordsCount_spacesOnly() {
        String input = "     ";
        int result = TextCounter.getWordsCount(input);
        assertEquals(0, result);
    }


}
