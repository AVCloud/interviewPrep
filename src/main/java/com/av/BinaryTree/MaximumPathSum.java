package com.av.BinaryTree;

public class MaximumPathSum {

    /*
     * Max path sum goes to 4 conditions
     *   1. root
     *   2. root + right
     *   3. root + left
     *   4. root + root + left
     * */

    public static int max = Integer.MIN_VALUE;

    public static int getMaxPath(Node node) {
        if (node == null) {
            return 0;
        }

        int left = getMaxPath(node.left);
        int right = getMaxPath(node.left);

        int single = Math.max(Math.max(left, right) + node.data, node.data);

        int top = Math.max(left + right + node.data, single);

        max = Math.max(max, top);

        return single;
    }
}
