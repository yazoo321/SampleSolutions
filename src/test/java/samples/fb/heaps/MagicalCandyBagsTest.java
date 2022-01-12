package samples.fb.heaps;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicalCandyBagsTest {

    MagicalCandyBags magicalCandyBags = new MagicalCandyBags();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 2, 1, 7, 4, 2 };
        int k = 3;
        int expected = 14;

        // When
        int actual = magicalCandyBags.maxCandies(in, k);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
