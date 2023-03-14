package samples.leetcode.fb.trees.Subtree;

import java.util.ArrayList;

public class NodesInSubtree {



    int[] countOfNodes(Node root, ArrayList<Query> queries, String s) {
        // Write your code here
        int[] res = new int[queries.size()];

        for (int i=0; i<queries.size();i++) {
            Node n = root;
            Query q = queries.get(i);

            Node head = findHead(n, q.u);
            res[i] = traverseAndCount(head, q.c, s, 0);
        }

        return res;
    }

    private Node findHead(Node n, int val) {
        if (n == null) {
            return null;
        }

        if (n.val == val) {
            return n;
        }

        Node res;
        for (Node c : n.children) {
            res = findHead(c, val);
            if (res != null) {
                return res;
            }
        }

        return null;
    }

    int traverseAndCount(Node n, char c, String s, int count) {
        if (n == null) {
            return count;
        }

        if (s.charAt(n.val - 1) == c) {
            count+=1;
        }

        for (Node node : n.children) {
            count = traverseAndCount(node, c, s, count);
        }

        return count;
    }

}
