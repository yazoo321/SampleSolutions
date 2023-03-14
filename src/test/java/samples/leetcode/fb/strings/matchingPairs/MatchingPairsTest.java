package samples.leetcode.fb.strings.matchingPairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.strings.matchingPairs.MatchingPairs;

public class MatchingPairsTest {

    MatchingPairs matchingPairs = new MatchingPairs();

    @Test
    void testExample1() {
        // Given
        String s = "abcd";
        String t = "adcb";
        int expected = 4;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        String s = "mno";
        String t = "mno";
        int expected = 1;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String s = "abcd";
        String t = "abce";
        int expected = 2;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample4() {
        // Given
        String s = "abcde";
        String t = "adcbe";
        int expected = 5;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample5() {
        // Given
        String s = "ab";
        String t = "cd";
        int expected = 0;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample6() {
        // Given
        String s = "abc";
        String t = "cde";
        int expected = 1;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample7() {
        // Given
        String s = "aaa";
        String t = "aab";
        int expected = 1;

        // When
        int actual = matchingPairs.matchingPairs(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
