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



}
