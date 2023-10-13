package com.saumitrasoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    @Test
    public void firstTest(){
        assertTrue("Hello World".equalsIgnoreCase("HELLO WORLD"));
    }

}
