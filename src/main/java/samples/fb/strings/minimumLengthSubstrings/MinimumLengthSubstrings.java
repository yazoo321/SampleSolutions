package samples.fb.strings.minimumLengthSubstrings;

// You are given two strings s and t. You can select any substring of string s and rearrange the characters of the selected substring.
// Determine the minimum length of the substring of s such that string t is a substring of the selected substring.
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

public class MinimumLengthSubstrings {

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) - 1);
        }

        int left = 0;
        int right = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;

        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }

            // while all values we want are present
            while(allValuesPresent(charMap) && left <= right) {
                int len = right - left + 1;
                if (len < res) {
                    res = len;
                    start = left;
                }
                char v = s.charAt(left++);
                if (charMap.containsKey(v)) {
                    charMap.put(v, charMap.get(v) - 1);
                }
            }
            right++;
        }

        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }

    boolean allValuesPresent(Map<Character, Integer> charMap) {
        for (char c : charMap.keySet()) {
            if (charMap.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

}
