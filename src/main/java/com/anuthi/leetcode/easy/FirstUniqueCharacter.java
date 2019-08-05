package com.anuthi.leetcode.easy;

/*
----------------------------------------------------------------------------------------------
Leetcode #387 (EASY) - First Unique Character in a String
----------------------------------------------------------------------------------------------
Given a string, find the first non-repeating character in it and return it's index.
If it doesn't exist, return -1.
You may assume the string contain only lowercase letters.

Example:
    s = "leetcode"
    return 0.

    s = "loveleetcode",
    return 2.
----------------------------------------------------------------------------------------------
*/

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    /*
    ------------------------------------------------------------------------------------------
        Time Complexity - O(n)
        Loops through the entire string once storing the character counts in a hashmap and
        returning the index of the first character with count of 1
    ------------------------------------------------------------------------------------------
    */
    public int firstUniqueChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

    /*
    ------------------------------------------------------------------------------------------
        Time Complexity - O(1)
        Since the problem statement assumes the string contains all lower case letters,
        we can loop through the lowercase letters and find the first and last index of each
        lowercase letter in the string and return the min index of unique character
        This can be done in constant time
    ------------------------------------------------------------------------------------------
    */
    public int firstUniqueCharNoExtraSpace(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int uniqueCharIndex = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (firstIndex != -1 && firstIndex == lastIndex) {
                uniqueCharIndex = Math.min(uniqueCharIndex, firstIndex);
            }
        }
        return uniqueCharIndex == Integer.MAX_VALUE ? -1 : uniqueCharIndex;
    }

}
