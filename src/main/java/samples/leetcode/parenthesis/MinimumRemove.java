package samples.leetcode.parenthesis;

// Leetcode 1249. Minimum remove to make valid parenthesis

// Given a string s of '(' , ')' and lowercase English characters.
//
// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
//
// Formally, a parentheses string is valid if and only if:
//
// It is the empty string, contains only lowercase characters, or
// It can be written as AB (A concatenated with B), where A and B are valid strings, or
// It can be written as (A), where A is a valid string.


import java.util.ArrayList;
import java.util.List;

public class MinimumRemove {

    public String minRemoveToMakeValid(String s) {
        int bracketCtr = 0;
        List<Integer> ignore = new ArrayList<>();

        bracketCtr = forwardSearch(s, ignore, bracketCtr);
        reverseSearch(s, ignore, bracketCtr);

        return generateString(s, ignore);
    }

    private int forwardSearch(String s, List<Integer> ignore, int bracketCtr) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                bracketCtr++;
            }

            if (c == ')') {
                if (bracketCtr > 0) {
                    bracketCtr--;
                } else {
                    ignore.add(i);
                }
            }
        }

        return bracketCtr;
    }

    private void reverseSearch(String s, List<Integer> ignore, int bracketCtr) {
        for (int i = s.length() - 1; i >= 0 && bracketCtr > 0; i--) {
            char c = s.charAt(i);

            if (c == '(') {
                ignore.add(i);
                bracketCtr--;
            }
        }
    }

    private String generateString(String s, List<Integer> ignore) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!ignore.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
