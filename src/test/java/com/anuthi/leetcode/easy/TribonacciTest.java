package com.anuthi.leetcode.easy;

import com.anuthi.leetcode.easy.Tribonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TribonacciTest {

    @Test
    public void testTribonacci() {
        Tribonacci t = new Tribonacci();
        Assertions.assertEquals(t.tribonacci(0), 0);
        Assertions.assertEquals(t.tribonacci(0), 0);
        Assertions.assertEquals(t.tribonacci(1), 1);
        Assertions.assertEquals(t.tribonacci(2), 1);
        Assertions.assertEquals(t.tribonacci(4), 4);
        Assertions.assertEquals(t.tribonacci(10), 149);
        Assertions.assertEquals(t.tribonacci(25), 1389537);
        Assertions.assertEquals(t.tribonacci(37), 2082876103);
    }
}
