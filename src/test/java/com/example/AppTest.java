package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    @Test
    public void testAdd() {
        App calc = new App();
        int result = calc.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
}