package samples.leetcode.fb.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.search.RevenueMilestones;

public class RevenueMilestonesTest {

    RevenueMilestones revenueMilestones = new RevenueMilestones();

    @Test
    void testExample1() {
        // Given
        int[] revenues = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] milestones = new int[] { 100, 200, 500 };

        int[] expected = new int[] { 4, 6, 10 };

        // When
        int[] actual = revenueMilestones.getMilestoneDays(revenues, milestones);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int revenues[] = {100, 200, 300, 400, 500};
        int milestones[] = {300, 800, 1000, 1400};
        int expected[] = {2, 4, 4, 5};

        // When
        int[] actual = revenueMilestones.getMilestoneDays(revenues, milestones);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        int revenues[] = {700, 800, 600, 400, 600, 700};
        int milestones[] = {3100, 2200, 800, 2100, 1000};
        int expected[] = {5, 4, 2, 3, 2};

        // When
        int[] actual = revenueMilestones.getMilestoneDays(revenues, milestones);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
