package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    
    @Test
    public void testAdd() {
        int result = Sample.add(2, 3);
        assertEquals(5, result);
    }
}