package samples.reverseToEqual;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseToEqualTest {

    ReverseToEqual reverseToEqual = new ReverseToEqual();

    @Test
    void testExample1() {
        // Given
        int[] arr_a = new int[] { 1, 2, 3, 4 };
        int[] arr_b = new int[] { 2, 4, 1, 3 };

        // when
        boolean actual = reverseToEqual.areTheyEqual(arr_a, arr_b);

        // then
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void testExample2() {
        // Given
        int[] arr_a = new int[] { 1, 2, 3, 4 };
        int[] arr_b = new int[] { 2, 4, 1, 5 };

        // when
        boolean actual = reverseToEqual.areTheyEqual(arr_a, arr_b);

        // then
        Assertions.assertThat(actual).isEqualTo(false);
    }
}
