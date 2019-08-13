package com.anuthi.leetcode.medium;

/*
-----------------------------------------------------------------------------------------------------------------------------
Leetcode #388 (MEDIUM) - Longest Absolute File Path
-----------------------------------------------------------------------------------------------------------------------------
Given a string representing the file system in the above format,
return the length of the longest absolute path to file in the abstracted file system.
If there is no file in the system, return 0.

    Suppose we abstract our file system by a string in the following manner:

    The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
    dir
        subdir1
        subdir2
            file.ext

    The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.

    The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
    dir
        subdir1
            file1.ext
            subsubdir1
        subdir2
            subsubdir2
                file2.ext
    The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext
    and an empty second-level sub-directory subsubdir1.
    subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

    We are interested in finding the longest (number of characters) absolute path to a file within our file system.
    For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext",
    and its length is 32 (not including the double quotes).

    Note:
        The name of a file contains at least a . and an extension.
        The name of a directory or sub-directory will not contain a ..
        Time complexity required: O(n) where n is the size of the input string.

        Notice that a/aa/aaa/file1.txt is not the longest file path, if there is another path aaaaaaaaaaaaaaaaaaaaa/sth.png.
*****************************************************************************************************************************
Explanation:
    Split the input string by \n
    Loop through each level and add the string to a list until a file name is found.
    When a file name is found get the length of the path for the file and store the max length in result

Time Complexity:
    O(n) - n is the number of characters in the input string
    The program loops through the characters in the input string just once
-----------------------------------------------------------------------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.List;

public class LongestAbsoluteFilePath {

    public int lengthLongestPath(String input) {
        List<String> levels = new ArrayList<>();
        int result = 0;
        String[] strings = input.split("\n");
        for (String str : strings) {
            int index = 0;
            int count = 0;
            while (index < str.length() && str.charAt(index) == '\t') {
                index++;
                count++;
            }
            if (count == levels.size()) {
                levels.add(str.substring(index));
            }
            else {
                levels.set(count, str.substring(index));
            }
            //System.out.println(levels);
            if (str.indexOf('.') != -1) {
                int len = 0;
                for (int j = 0; j <= count; j++) {
                    len += levels.get(j).length();
                }
                result = Math.max(result, len + count);
            }
        }

        return result;
    }
}
