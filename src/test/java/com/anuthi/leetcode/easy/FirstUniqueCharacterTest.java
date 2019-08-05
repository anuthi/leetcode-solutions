package com.anuthi.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterTest {

    private FirstUniqueCharacter t;

    @BeforeEach
    void beforeEach() {
        t = new FirstUniqueCharacter();
    }

    @Test
    void testFirstUniqueChar() {

        Assertions.assertEquals(t.firstUniqueChar("leetcode"), 0);
        Assertions.assertEquals(t.firstUniqueChar("loveleetcode"), 2);
        Assertions.assertEquals(t.firstUniqueChar("cooco"), -1);
        Assertions.assertEquals(t.firstUniqueChar(""), -1);
        Assertions.assertEquals(t.firstUniqueChar(null), -1);
    }

    @Test
    void testFirstUniqueCharNoExtraSpace() {
        Assertions.assertEquals(t.firstUniqueCharNoExtraSpace("leetcode"), 0);
        Assertions.assertEquals(t.firstUniqueCharNoExtraSpace("loveleetcode"), 2);
        Assertions.assertEquals(t.firstUniqueCharNoExtraSpace("cooco"), -1);
        Assertions.assertEquals(t.firstUniqueCharNoExtraSpace(""), -1);
        Assertions.assertEquals(t.firstUniqueCharNoExtraSpace(null), -1);
    }
}
