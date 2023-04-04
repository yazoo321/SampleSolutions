package samples.hackerrank.data_structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReverseArrayTest {

    @Test
    void testBasicScenario() {
        // given
        List<Integer> input = List.of(1,4,3,2);

        // when
        List<Integer> out = ReverseArray.reverseArray(input);

        // then
        Assertions.assertThat(out).usingRecursiveComparison().isEqualTo(List.of(2,3,4,1));
    }
}

