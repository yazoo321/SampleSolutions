package samples.hackerrank.basic_prep.repeated_strings;

import java.math.BigDecimal;
import java.math.RoundingMode;

//There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.
//
//Example
//  s = 'abcac'
//  n = 10
//The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
//
//Function Description
//
//Complete the repeatedString function in the editor below.
//
//repeatedString has the following parameter(s):
//
//s: a string to repeat
//n: the number of characters to consider
//Returns
//
//int: the frequency of a in the substring
//Input Format
//
//The first line contains a single string, .
//The second line contains an integer, .
//
//Constraints
//
//For  of the test cases, .
//Sample Input
//
//Sample Input 0
//
//aba
//10
//Sample Output 0
//
//7
//Explanation 0
//The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .
//
//Sample Input 1
//
//a
//1000000000000
//Sample Output 1
//
//1000000000000
public class RepeatedStrings {

    public static long repeatedString(String s, long n) {
        // Write your code here

        if (s == null || s.isEmpty()) {
            return -1;
        }

        long length = s.length();
        long times = n / length;
        long remainder = n % length;

        // count number of a's
        long extras = 0;
        long baseCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a == 'a') {
                baseCount++;
                if (i < remainder) {
                    extras++;
                }
            }
        }

        return (times * baseCount) + extras;
    }
}
