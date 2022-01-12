package samples.fb.heaps;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestTripleProductTest {

    LargestTripleProducts largestTripleProducts = new LargestTripleProducts();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 1, 2, 3, 4, 5 };
        int[] expected = new int[] { -1, -1, 6, 24, 60 };

        // When
        int[] actual = largestTripleProducts.findMaxProduct(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int[] in = new int[] { 2, 1, 2, 1, 2 };
        int[] expected = new int[] { -1, -1, 4, 4, 8 };

        // When
        int[] actual = largestTripleProducts.findMaxProduct(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        int[] in = new int[] { 1, 1, 2, 1, 6 };
        int[] expected = new int[] { -1, -1, 2, 2, 12 };

        // When
        int[] actual = largestTripleProducts.findMaxProduct(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
