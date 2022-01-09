package samples.fb.strings.matchingPairs;

// Matching Pairs
// Given two strings s and t of length N, find the maximum number of possible matching pairs in strings s and t after swapping exactly two characters within s.
// A swap is switching s[i] and s[j], where s[i] and s[j] denotes the character that is present at the ith and jth index of s, respectively. The matching pairs of the two strings are defined as the number of indices for which s[i] and t[i] are equal.
// Note: This means you must swap two characters at different indices.
// Signature
// int matchingPairs(String s, String t)
// Input
// s and t are strings of length N
// N is between 2 and 1,000,000
// Output
// Return an integer denoting the maximum number of matching pairs
// Example 1
// s = "abcd"
// t = "adcb"
// output = 4
// Explanation:
// Using 0-based indexing, and with i = 1 and j = 3, s[1] and s[3] can be swapped, making it  "adcb".
// Therefore, the number of matching pairs of s and t will be 4.
// Example 2
// s = "mno"
// t = "mno"
// output = 1
// Explanation:
// Two indices have to be swapped, regardless of which two it is, only one letter will remain the same. If i = 0 and j=1, s[0] and s[1] are swapped, making s = "nmo", which shares only "o" with t.


import java.util.ArrayList;
import java.util.List;

public class MatchingPairs {

    int matchingPairs(String s, String t) {
        // Write your code here

        List<Integer> mismatchIdx = new ArrayList<>();
        int matchCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char cin = s.charAt(i);
            char ct = t.charAt(i);

            if (cin != ct) {
                mismatchIdx.add(i);
            } else {
                matchCnt++;
            }
        }

        if (mismatchIdx.size() < 1) {
            return matchCnt - 2;
        }

        if (mismatchIdx.size() < 2) {
            return matchCnt - 1;
        }

        int pairScore = 0;
        boolean reserve = false;

        for (int i = 0; i < mismatchIdx.size() && pairScore != 2; i++) {
            // check swapping indexes
            int vi = mismatchIdx.get(i);

            pairScore = 0;
            for (int j = i+1; j < mismatchIdx.size() && pairScore != 2; j++) {
                int vj = mismatchIdx.get(j);

                char i1 = s.charAt(vi);
                char i2 = s.charAt(vj);

                char t1 = t.charAt(vi);
                char t2 = t.charAt(vj);

                if (i1 == t2) {
                    // 1 pair good
                    reserve = true;
                    pairScore++;
                }

                if (i2 == t1) {
                    // 1 pair good
                    reserve = true;
                    pairScore++;
                }
            }
        }

        if (pairScore == 2) {
            matchCnt = matchCnt + 2;
        } else if (reserve) {
            matchCnt++;
        }

        return matchCnt;
    }

}
