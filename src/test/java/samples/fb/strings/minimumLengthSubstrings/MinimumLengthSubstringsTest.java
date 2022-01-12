package samples.fb.strings.minimumLengthSubstrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumLengthSubstringsTest {

    MinimumLengthSubstrings minimumLengthSubstrings = new MinimumLengthSubstrings();

    @Test
    void testExample1() {
        // Given
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";

        // When
        String actual = minimumLengthSubstrings.minWindow(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }


    @Test
    void testExample2() {
        // Given
        String s = "a";
        String t = "a";
        String expected = "a";

        // When
        String actual = minimumLengthSubstrings.minWindow(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String s = "aaabbbfaaccccdeeefaaf";
        String t = "ffa";
        String expected = "faaf";

        // When
        String actual = minimumLengthSubstrings.minWindow(s, t);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
