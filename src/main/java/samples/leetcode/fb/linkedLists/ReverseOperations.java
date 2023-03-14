package samples.leetcode.fb.linkedLists;

import java.util.*;

public class ReverseOperations {

    Node reverse(Node head) {
        Node result = new Node();
        Node newHead = result;
        Stack<Integer> stack = new Stack<>();

        Node node = head;
        while (node != null) {
            if (node.data % 2 == 0) {
                stack.push(node.data);
            } else {
                // process stack in reverse, add current value to list
                result = addInReverse(stack, result);
                result.next = new Node(node.data);
                result = result.next;
            }
            node = node.next;
        }
        addInReverse(stack, result);
        return newHead.next;
    }


    Node addInReverse(Stack<Integer> stack, Node n) {
        while (!stack.isEmpty()) {
            n.next = new Node(stack.pop());
            n = n.next;
        }

        return n;
    }


}
