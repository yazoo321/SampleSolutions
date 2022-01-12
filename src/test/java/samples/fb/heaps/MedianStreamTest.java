package samples.fb.heaps;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianStreamTest {

    MedianStream medianStream = new MedianStream();


    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 5, 15, 1, 3 };
        int[] expected = new int[] { 5, 10, 5, 4 };

        // When
        int[] actual = medianStream.findMedian(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
