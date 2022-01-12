package samples.fb.strings.minimumLengthSubstrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinLengthForSubstringsTest {

    MinLengthForSubstrings minLengthForSubstrings = new MinLengthForSubstrings();

    @Test
    void testExample1() {
        // Given
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int expected = 4;

        // When
        int actual = minLengthForSubstrings.minLengthSubstring(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }


    @Test
    void testExample2() {
        // Given
        String s = "a";
        String t = "a";
        int expected = 1;

        // When
        int actual = minLengthForSubstrings.minLengthSubstring(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String s = "aaabbbfaaccccdeeefaaf";
        String t = "ffa";
        int expected = 4;

        // When
        int actual = minLengthForSubstrings.minLengthSubstring(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
