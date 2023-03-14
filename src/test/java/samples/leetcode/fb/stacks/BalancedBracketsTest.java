package samples.leetcode.fb.stacks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.stacks.BalanceBrackets;

public class BalancedBracketsTest {

    BalanceBrackets balanceBrackets = new BalanceBrackets();

    @Test
    void testExample1() {
        // Given
        String input = "{[()]}";
        boolean expected = true;

        // When
        boolean actual = balanceBrackets.isBalanced(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        String input = "{}()";
        boolean expected = true;

        // When
        boolean actual = balanceBrackets.isBalanced(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String input = "{(})";
        boolean expected = false;

        // When
        boolean actual = balanceBrackets.isBalanced(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample4() {
        // Given
        String input = ")";
        boolean expected = false;

        // When
        boolean actual = balanceBrackets.isBalanced(input);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
