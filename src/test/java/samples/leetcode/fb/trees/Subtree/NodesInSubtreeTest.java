package samples.leetcode.fb.trees.Subtree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.trees.Subtree.Node;
import samples.leetcode.fb.trees.Subtree.NodesInSubtree;
import samples.leetcode.fb.trees.Subtree.Query;

import java.util.ArrayList;
import java.util.List;

public class NodesInSubtreeTest {

    NodesInSubtree nodesInSubtree = new NodesInSubtree();

    @Test
    void testExample1() {
        // Given
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.children = new ArrayList<>(List.of(left, right));

        Query q = new Query(1, 'a');
        int[] expected = new int[] {2};

        // When
        int[] actual = nodesInSubtree.countOfNodes(root, new ArrayList<>(List.of(q)), "aba");

        // Then

        Assertions.assertThat(actual).isEqualTo(expected);

    }


}
