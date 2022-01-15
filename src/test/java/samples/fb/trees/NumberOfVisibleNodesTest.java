package samples.fb.trees;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfVisibleNodesTest {

    NumberOfVisibleNodes numberOfVisibleNodes = new NumberOfVisibleNodes();


    @Test
    void testExample1() {
        // Given
        Node root = new Node(8);
        Node three = new Node(3);
        Node one = new Node(1);
        Node six = new Node(6);
        Node four = new Node(4);
        Node seven = new Node(7);
        Node ten = new Node(10);
        Node fourteen = new Node(14);
        Node thirteen = new Node(13);

        root.left = three;
        root.right = ten;
        three.left = one;
        three.right = six;
        six.left = four;
        six.right = seven;
        ten.right = fourteen;
        fourteen.left = thirteen;

        int expected = 4;

        // when
        int actual = numberOfVisibleNodes.visibleNodes(root);

        Assertions.assertThat(actual).isEqualTo(expected);

    }



}
