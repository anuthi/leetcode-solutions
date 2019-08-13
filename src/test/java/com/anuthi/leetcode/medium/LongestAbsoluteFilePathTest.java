package com.anuthi.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestAbsoluteFilePathTest {

    @Test
    void lengthLongestPathTest() {
        LongestAbsoluteFilePath l = new LongestAbsoluteFilePath();
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        Assertions.assertEquals(l.lengthLongestPath(input), 20);
        input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\t\t\ttestabcdefg.txt\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        Assertions.assertEquals(l.lengthLongestPath(input), 38);
        input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        Assertions.assertEquals(l.lengthLongestPath(input), 32);
        input = "dir\n\tsubdir1\n\t\tsubsubdir1\n\t\tsubsubdir2";
        Assertions.assertEquals(l.lengthLongestPath(input), 0);
        input = "dir";
        Assertions.assertEquals(l.lengthLongestPath(input), 0);

    }
}