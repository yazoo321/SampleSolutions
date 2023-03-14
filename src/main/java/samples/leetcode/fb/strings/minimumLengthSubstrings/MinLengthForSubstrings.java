package samples.leetcode.fb.strings.minimumLengthSubstrings;
// Minimum Length Substrings
// You are given two strings s and t. You can select any substring of string s and rearrange the characters of the selected substring. Determine the minimum length of the substring of s such that string t is a substring of the selected substring.
// Signature
// int minLengthSubstring(String s, String t)
// Input
// s and t are non-empty strings that contain less than 1,000,000 characters each
// Output
// Return the minimum length of the substring of s. If it is not possible, return -1
// Example
// s = "dcbefebce"
// t = "fd"
// output = 5
// Explanation:
// Substring "dcbef" can be rearranged to "cfdeb", "cefdb", and so on. String t is a substring of "cfdeb". Thus, the minimum length required is 5.

import java.util.*;

public class MinLengthForSubstrings {


    int minLengthSubstring(String s, String t) {
        // Write your code here

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) - 1);
        }

        int left = 0;
        int right = 0;
        int res = Integer.MAX_VALUE;

        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }

            // if all values are present in this window, try move the left forward
            while (allCharsPresent(charMap) && left<=right) {
                int len = right - left + 1;
                if (len < res) {
                    res = len;
                }
                char tmp = s.charAt(left++);
                if (charMap.containsKey(tmp)) {
                    charMap.put(tmp, charMap.get(tmp) -1);
                }

            }

            right++;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    boolean allCharsPresent(Map<Character, Integer> charMap) {
        for (char k : charMap.keySet()) {
            if (charMap.get(k) < 0) {
                return false;
            }
        }
        return true;
    }

}
