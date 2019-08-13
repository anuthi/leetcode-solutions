package com.anuthi.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicalNumbersTest {

    @Test
    void lexicalOrderTest() {
        LexicographicalNumbers t = new LexicographicalNumbers();
        Assertions.assertEquals(t.lexicalOrder(0), new ArrayList<>());
        Assertions.assertEquals(t.lexicalOrder(10), Arrays.asList(1, 10, 2, 3, 4, 5, 6, 7, 8, 9));
        Assertions.assertEquals(t.lexicalOrder(13), Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}