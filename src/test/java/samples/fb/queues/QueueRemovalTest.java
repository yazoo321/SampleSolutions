package samples.fb.queues;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueRemovalTest {

    QueueRemoval queueRemoval = new QueueRemoval();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 1, 2, 2, 3, 4, 5 };
        int x = 5;

        int[] expected = new int[] { 5, 6, 4, 1, 2 };

        // When
        int[] actual = queueRemoval.findPositions(in, x);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
