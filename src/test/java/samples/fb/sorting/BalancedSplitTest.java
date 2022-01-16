package samples.fb.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedSplitTest {

    BalancedSplit balancedSplit = new BalancedSplit();

    @Test
    void testExample1() {
        // Given
        int[] input = new int[] { 1, 5, 7, 1 };
        boolean expected = true;

        // When
        boolean actual = balancedSplit.balancedSplitExists(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int[] input = new int[] { 12, 7, 6, 7, 6 };
        boolean expected = false;

        // When
        boolean actual = balancedSplit.balancedSplitExists(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
