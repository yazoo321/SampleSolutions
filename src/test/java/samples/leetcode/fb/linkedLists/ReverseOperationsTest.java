package samples.leetcode.fb.linkedLists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import samples.leetcode.fb.linkedLists.Node;
import samples.leetcode.fb.linkedLists.ReverseOperations;

public class ReverseOperationsTest {

    ReverseOperations reverseOperations = new ReverseOperations();

    @Test
    void testExample1() {
        // Given
        int[] in = new int[] { 1, 2, 8, 9, 12, 16 };
        Node head_in = createLinkedList(in);
        int[] exp = new int[] { 1, 8, 2, 9, 16, 12 };
        Node expected = createLinkedList(exp);

        // When
        Node actual = reverseOperations.reverse(head_in);

        // Then
        while (expected.next != null ) {
            Assertions.assertThat(actual.data).isEqualTo(expected.data);
            expected = expected.next;
            actual = actual.next;
        }
    }

    private Node createLinkedList(int[] arr) {
        Node head = null;
        Node tempHead = head;
        for (int v : arr) {
            if (head == null) {
                head = new Node(v);
                tempHead = head;
            } else {
                head.next = new Node(v);
                head = head.next;
            }
        }
        return tempHead;
    }
}
