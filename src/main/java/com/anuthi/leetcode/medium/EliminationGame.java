package com.anuthi.leetcode.medium;

/*
-----------------------------------------------------------------------------------------------------------------------------
Leetcode #390 (MEDIUM) - Elimination Game
-----------------------------------------------------------------------------------------------------------------------------
Problem Statement:
    There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and
    every other number afterward until you reach the end of the list.
    Repeat the previous step again, but this time from right to left, remove the right most number and
    every other number from the remaining numbers.
    We keep repeating the steps again, alternating left to right and right to left, until a single number remains.
    Find the last number that remains starting with a list of length n.

Example:
    Input:
        n = 9,
        1 2 3 4 5 6 7 8 9
        2 4 6 8
        2 6
        6

    Output:
        6
*****************************************************************************************************************************
Explanation:
    After each iteration the length of the numbers remaining goes down by 1/2 and the difference between the numbers
    increases in multiples of 2 (include a - as we alternate directions at each round)

Time Complexity:
    O(n)
-----------------------------------------------------------------------------------------------------------------------------
 */

public class EliminationGame {

    public int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 2;
        int offset = 2;
        int len = n / 2;
        while (len > 1) {
            first = first + offset * (len - 2);
            offset = offset * -2;
            len = len / 2;
        }
        return first;

    }
}
