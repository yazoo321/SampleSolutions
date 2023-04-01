package samples.hackerrank.basic_prep.repeated_strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedStringsTest {

    @Test
    void testBasicRepeatedString() {
        // given
        long n = 10;
        String s = "aba";

        // when
        long res = RepeatedStrings.repeatedString(s, n);

        // then
        Assertions.assertThat(res).isEqualTo(7);
    }

    @Test
    void testSingularChar() {
        // given
        long n = 1000000000000L;
        String s = "a";

        // when
        long res = RepeatedStrings.repeatedString(s, n);

        // then
        Assertions.assertThat(res).isEqualTo(1000000000000L);
    }
}
