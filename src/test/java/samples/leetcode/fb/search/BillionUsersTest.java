package samples.leetcode.fb.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.search.BillionUsers;

public class BillionUsersTest {

    BillionUsers billionUsers = new BillionUsers();

    @Test
    void testExample1() {
        // Given
        float[] growth = new float[] { (float) 1.5 };
        int expected = 52;

        // When
        int actual = billionUsers.getBillionUsersDay(growth);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
