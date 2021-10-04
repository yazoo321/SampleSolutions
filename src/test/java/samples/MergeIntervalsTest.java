package samples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void testMergeIntervalsReturnsExpectedOnBasicInput() {
        // given
        int[][] intervals = new int[4][2];
        intervals[0] = new int[] {1,6};
        intervals[1] = new int[] {2,6};
        intervals[2] = new int[] {8,10};
        intervals[3] = new int[] {15, 18};

        int[][] expected = new int[3][2];
        expected[0] = new int[] {1,6};
        expected[1] = new int[] {8,10};
        expected[2] = new int[] {15,18};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        Assertions.assertEquals(expected, result13);
    }
}
