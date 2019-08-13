package com.anuthi.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    @Test
    void findTheDifferenceTest() {
        FindTheDifference f = new FindTheDifference();
        Assertions.assertEquals(f.findTheDifference("abcd", "abcde"), 'e');
        Assertions.assertEquals(f.findTheDifference("tqra", "tarqa"), 'a');
        Assertions.assertEquals(f.findTheDifference("bad", "bbad"), 'b');
        Assertions.assertEquals(f.findTheDifference("query", "yreuaq"), 'a');
    }
}