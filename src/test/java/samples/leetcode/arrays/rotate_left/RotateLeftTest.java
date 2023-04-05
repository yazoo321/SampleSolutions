package samples.leetcode.arrays.rotate_left;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RotateLeftTest {

    @Test
    void testBasicRotate() {
        // given

        // when
        List<Integer> res = RotateLeft.rotateLeft(54, List.of(1,2,3,4,5));


        Assertions.assertThat(res).isEqualTo(List.of(5,1,2,3,4));
    }

}
