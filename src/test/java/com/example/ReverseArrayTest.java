package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {

    @Test
    public void testReverse() {
        int[] input = {1, 2, 3};
        int[] expected = {3, 2, 1};

        assertArrayEquals(expected, ReverseArray.reverse(input));
    }
}