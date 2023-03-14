package samples.hackerrank.basic_prep.jumping_on_clouds;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JumpingOnCloudsTest {


    @Test
    void testBasicScenarioWith6Clouds() {
        // given
        int n = 6;
        List<Integer> list = List.of(0, 0, 0, 0, 1, 0);

        // when
        int actual = JumpingOnClouds.jumpingOnClouds(list);

        // then
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void testAnotherBasicScenarioWith6Clouds() {
        // given
        List<Integer> list = List.of(0, 0, 0, 1, 0, 0);

        // when
        int actual = JumpingOnClouds.jumpingOnClouds(list);

        // then
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void testBasicScenarioWith7Clouds() {
        // given
        int n = 6;
        List<Integer> list = List.of(0, 0, 1, 0, 0, 1, 0);

        // when
        int actual = JumpingOnClouds.jumpingOnClouds(list);

        // then
        Assertions.assertThat(actual).isEqualTo(4);
    }
}
