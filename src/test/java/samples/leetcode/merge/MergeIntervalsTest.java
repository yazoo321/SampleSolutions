package samples.leetcode.merge;

import org.junit.jupiter.api.Test;
import samples.leetcode.merge.MergeIntervals;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeIntervalsTest {

    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void testMergeIntervalsReturnsExpectedOnBasicInput() {
        // given
        int[][] intervals = new int[4][2];
        intervals[0] = new int[]{1, 3};
        intervals[1] = new int[]{2, 6};
        intervals[2] = new int[]{8, 10};
        intervals[3] = new int[]{15, 18};

        int[][] expected = new int[3][2];
        expected[0] = new int[]{1, 6};
        expected[1] = new int[]{8, 10};
        expected[2] = new int[]{15, 18};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    void testMergeIntervalsReturnsExpectedOnReverseInput() {
        // given
        int[][] intervals = new int[4][2];
        intervals[0] = new int[]{2, 6};
        intervals[1] = new int[]{1, 6};
        intervals[2] = new int[]{8, 10};
        intervals[3] = new int[]{15, 18};

        int[][] expected = new int[3][2];
        expected[0] = new int[]{1, 6};
        expected[1] = new int[]{8, 10};
        expected[2] = new int[]{15, 18};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    void testMergeIntervalsReturnsExpectedOnMoreComplexInput() {
        // given
        int[][] intervals = new int[6][2];
        intervals[0] = new int[]{1, 3};
        intervals[1] = new int[]{1, 3};
        intervals[2] = new int[]{2, 6};
        intervals[3] = new int[]{2, 6};
        intervals[4] = new int[]{10, 14};
        intervals[5] = new int[]{8, 15};

        int[][] expected = new int[2][2];
        expected[0] = new int[]{1, 6};
        expected[1] = new int[]{8, 15};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    void testMergeIntervalsReturnsExpectedOnBiggerTest() {
        // given
        int[][] intervals = new int[5][2];
        intervals[0] = new int[]{2, 3};
        intervals[1] = new int[]{4, 5};
        intervals[2] = new int[]{6, 7};
        intervals[3] = new int[]{8, 9};
        intervals[4] = new int[]{1, 10};

        int[][] expected = new int[1][2];
        expected[0] = new int[]{1, 10};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < result.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);

        }
    }

    @Test
    void testMergeIntervalsReturnsExpectedOnUnorderedConnectedList() {
        // given
        int[][] intervals = new int[5][2];
        intervals[0] = new int[]{6, 7};
        intervals[1] = new int[]{2, 3};
        intervals[3] = new int[]{4, 5};
        intervals[4] = new int[]{8, 9};

        int[][] expected = new int[5][2];
        expected[0] = new int[]{6, 7};
        expected[1] = new int[]{2, 3};
        expected[3] = new int[]{4, 5};
        expected[4] = new int[]{8, 9};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    void testMergeIntervalsReturnsExpectedOnBasicConnectedSample() {
        // given
        int[][] intervals = new int[2][2];
        intervals[0] = new int[]{1, 4};
        intervals[1] = new int[]{5, 6};

        int[][] expected = new int[2][2];
        expected[0] = new int[]{1, 4};
        expected[1] = new int[]{5, 6};

        // when
        int[][] result = mergeIntervals.merge(intervals);

        // then
        assertThat(result.length).isEqualTo(expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertThat(result[i]).isEqualTo(expected[i]);
        }
    }
}