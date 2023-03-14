package samples.leetcode.parenthesis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.parenthesis.MinimumRemove;

public class MinimumRemoveTest {

    MinimumRemove minimumRemove = new MinimumRemove();

    @Test
    void testExample1() {
        // Given
        String s = "lee(t(c)o)de)";
        String expected = "lee(t(c)o)de";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample2() {
        // Given
        String s = "a)b(c)d";
        String expected = "ab(c)d";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample3() {
        // Given
        String s = "))((";
        String expected = "";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample4() {
        // Given
        String s = "(a(b(c)d)";
        String expected = "(a(bc)d)";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample5() {
        // Given
        String s = ")(";
        String expected = "";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample6() {
        // Given
        String s = "((((";
        String expected = "";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample7() {
        // Given
        String s = "))))";
        String expected = "";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample8() {
        // Given
        String s = "())()(((";
        String expected = "()()";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample9() {
        // Given
        String s = "(t(e)y))d(()(e(";
        String expected = "(t(e)y)d()e";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

    @Test
    void testExample10() {
        // Given
        String s = "))((";
        String expected = "";

        // When
        String output = minimumRemove.minRemoveToMakeValid(s);

        // Then
        Assertions.assertThat(output).isEqualTo(expected);
    }

}
