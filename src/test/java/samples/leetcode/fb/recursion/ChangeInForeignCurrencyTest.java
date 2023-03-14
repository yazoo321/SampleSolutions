package samples.leetcode.fb.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.recursion.ChangeInForeignCurrency;

public class ChangeInForeignCurrencyTest {

    ChangeInForeignCurrency changeInForeignCurrency = new ChangeInForeignCurrency();


    @Test
    void testExample1() {
        // Given
        int target = 94;
        int[] denominations = new int[] { 5, 10, 25, 100, 200 };
        boolean expected = false;

        // When
        boolean actual = changeInForeignCurrency.canGetExactChange(target, denominations);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        int target = 75;
        int[] denominations = new int[] { 4, 17, 29 };
        boolean expected = true;

        // When
        boolean actual = changeInForeignCurrency.canGetExactChange(target, denominations);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
