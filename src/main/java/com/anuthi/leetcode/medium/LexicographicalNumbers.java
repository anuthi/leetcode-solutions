package com.anuthi.leetcode.medium;

/*
----------------------------------------------------------------------------------------------
Leetcode #386 (MEDIUM) - Lexicographical Numbers
----------------------------------------------------------------------------------------------
Given an integer n, return 1 - n in lexicographical order.
For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
Please optimize your algorithm to use less time and space.
The input size may be as large as 5,000,000.
Explanation:
    Use DFS for each digit starting from 1 until the number n is reached
        1     2
       / \   /
      10..19 20..29
     /       /
    100...  200...


Time Complexity:
    O(n)
    The algorithm touches each node in the tree only once
----------------------------------------------------------------------------------------------
*/

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if (i <= n) {
                dfs(i, n, result);
            }
        }
        return result;
    }

    private void dfs(int first, int last, List<Integer> result) {
        if (first > last)
            return;
        result.add(first);
        for (int i = 0; i < 10; i++) {
            dfs(first * 10 + i, last, result);
        }
    }
}
