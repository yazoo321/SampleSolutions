package samples.fb.arrays.contigous;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContigousSubarraysTest {

    ContigousSubarrays contigousSubarrays = new ContigousSubarrays();

    @Test
    void testExample1() {
        // Given
        int[] input = new int[] { 3, 4, 1, 6 ,2 };
        int[] expected = new int[] { 1, 3, 1, 5, 1 };

        // When
        int[] actual = contigousSubarrays.countSubarrays(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
