package samples.leetcode.fb.trees;

public class NumberOfVisibleNodes {




    int visibleNodes(Node root) {
        // Write your code here
        return findMax(root, 0, 0);
    }

    int findMax(Node node, int current, int max) {
        current++;

        if (node.left != null) {
            max = Math.max(max, findMax(node.left, current, max));
        }
        if (node.right != null) {
            max = Math.max(max, findMax(node.right, current, max));
        }

        return Math.max(current, max);
    }
}
