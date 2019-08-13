package com.anuthi.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminationGameTest {

    @Test
    void lastRemainingTest() {
        EliminationGame e = new EliminationGame();
        Assertions.assertEquals(e.lastRemaining(10), 8);
        Assertions.assertEquals(e.lastRemaining(20), 6);
        Assertions.assertEquals(e.lastRemaining(24), 14);
        Assertions.assertEquals(e.lastRemaining(13), 6);
        Assertions.assertEquals(e.lastRemaining(9), 6);
    }
}