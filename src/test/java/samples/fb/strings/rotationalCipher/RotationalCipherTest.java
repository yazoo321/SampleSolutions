package samples.fb.strings.rotationalCipher;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotationalCipherTest {

    RotationalCipher rotationalCipher = new RotationalCipher();

    @Test
    void testExample1() {
        // Given
        String input = "Zebra-493?";
        int rotation = 3;
        String expected = "Cheud-726?";

        // When
        String actual = rotationalCipher.rotationalCipher(input, rotation);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        String input = "abcdefghijklmNOPQRSTUVWXYZ0123456789";
        int rotation = 39;
        String expected = "nopqrstuvwxyzABCDEFGHIJKLM9012345678";

        // When
        String actual = rotationalCipher.rotationalCipher(input, rotation);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
