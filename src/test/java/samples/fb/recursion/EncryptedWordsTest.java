package samples.fb.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncryptedWordsTest {

    EncryptedWords encryptedWords = new EncryptedWords();

    @Test
    void testExample1() {
        // Given
        String in = "abc";
        String expected = "bac";

        // When
        String actual = encryptedWords.findEncryptedWord(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        String in = "abcd";
        String expected = "bacd";

        // When
        String actual = encryptedWords.findEncryptedWord(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String in = "abcxcba";
        String expected = "xbacbca";

        // When
        String actual = encryptedWords.findEncryptedWord(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testExample4() {
        // Given
        String in = "facebook";
        String expected = "eafcobok";

        // When
        String actual = encryptedWords.findEncryptedWord(in);

        // Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
