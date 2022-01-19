package samples.fb.graphs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimizingPermutationsTest {

    MinimizingPermutations minimizingPermutations = new MinimizingPermutations();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 3, 1, 2 };
        int expected = 2;

        // When
        int actual = minimizingPermutations.minOperations(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
