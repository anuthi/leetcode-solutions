package com.anuthi.leetcode.easy;

/*
-----------------------------------------------------------------------------------------------------------------------------
Leetcode #389 (EASY) - Find the difference
-----------------------------------------------------------------------------------------------------------------------------
Problem Statement:
    Given two strings s and t which consist of only lowercase letters.
    String t is generated by random shuffling string s and then add one more letter at a random position.
    Find the letter that was added in t.

Example:
    Input:
        s = "abcd"
        t = "abcde"
    Output:
        e
    Explanation:
        'e' is the letter that was added.
*****************************************************************************************************************************
Explanation:
    Get the sum of characters for each string and return the character for the difference in the sums of the two strings

Time Complexity:
    O(n) - n is the length of the second string
-----------------------------------------------------------------------------------------------------------------------------
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (char c : s.toCharArray()) {
            sum1 += c;
        }
        for (char c : t.toCharArray()) {
            sum2 += c;
        }
        return (char) (sum2 - sum1);
    }
}
