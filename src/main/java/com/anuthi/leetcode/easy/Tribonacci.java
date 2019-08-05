package com.anuthi.leetcode.easy;

/*
----------------------------------------------------------------------------------------------
Leetcode #1137 (EASY) - N-th Tribonacci Number
----------------------------------------------------------------------------------------------
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.

Constraints:
    0 <= n <= 37
    The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

Explanation:
    Use memoization to store T(n-1) so as not to calculate the same tribonacci number
    multiple times

Time Complexity:
    O(n)
    The program only loops through n times to find the value of the n-th tribonacci
    number
----------------------------------------------------------------------------------------------
*/

public class Tribonacci {

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] mem = new int[n + 1];
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 1;
        for (int i = 3; i <= n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2] + mem[i - 3];
        }
        return mem[n];
    }
}
