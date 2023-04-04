package samples.hackerrank.data_structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HourglassSumTest {

    @Test
    void testBasicScenario() {
        // given
        List<List<Integer>> arr = List.of(
                List.of(1,1,1,0,0,0),
                List.of(0,1,0,0,0,0),
                List.of(1,1,1,0,0,0),
                List.of(0,0,2,4,4,0),
                List.of(0,0,0,2,0,0),
                List.of(0,0,1,2,4,0)
        );

        // when
        int res = HourglassSum.hourglassSum(arr);

        // then
        Assertions.assertThat(res).isEqualTo(19);
    }
}
