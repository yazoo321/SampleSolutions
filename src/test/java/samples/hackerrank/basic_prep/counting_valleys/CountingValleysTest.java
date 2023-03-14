package samples.hackerrank.basic_prep.counting_valleys;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingValleysTest {

    @Test
    void testBasicValleyReturnsExpected() {
        // given
        int n = 8;
        String valley = "UDDDUDUU";

        // when
        int actual = CountingValleys.countingValleys(n, valley);

        // then
        Assertions.assertThat(actual).isEqualTo(1);
    }
}
