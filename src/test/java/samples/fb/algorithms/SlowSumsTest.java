package samples.fb.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlowSumsTest {

    SlowSums slowSums = new SlowSums();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 4, 2, 1, 3 };
        int expected = 26;

        // When
        int actual = slowSums.getTotalTime(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
