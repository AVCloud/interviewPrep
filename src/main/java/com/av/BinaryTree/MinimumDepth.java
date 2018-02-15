package com.av.BinaryTree;

public class MinimumDepth {

    public static void main(String[] args) {
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);

        System.out.println("min depth is "+minimumDepth(root));
    }

    public static  int minimumDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = 1 + minimumDepth(node.left);
        int right = 1 + minimumDepth(node.right);
        return Math.min(left, right);
    }
}
