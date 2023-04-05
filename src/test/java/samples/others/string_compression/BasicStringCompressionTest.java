package samples.others.string_compression;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicStringCompressionTest {


    @Test
    void testBasicExample() {
        // given
        BasicStringCompression basicStringCompression = new BasicStringCompression();
        String input = "3[abc]";
        String expected = "abcabcabc";

        // when
        String output = basicStringCompression.decompress(input);

        // then
        Assertions.assertThat(output).isEqualTo(expected);
    }




    @Test
    void testScenario2() {
        // given
        BasicStringCompression basicStringCompression = new BasicStringCompression();
        String input = "3[abc]4[ab]c";
        String expected = "abcabcabcababababc";

        // when
        String output = basicStringCompression.decompress(input);

        // then
        Assertions.assertThat(output).isEqualTo(expected);
    }
}
