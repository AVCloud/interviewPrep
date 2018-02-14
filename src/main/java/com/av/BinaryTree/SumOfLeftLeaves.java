package com.av.BinaryTree;

public class SumOfLeftLeaves {

    private static int sum = 0;

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(9);
        root.right = new Node(49);
        root.left.right = new Node(12);
        root.left.left = new Node(5);
        root.right.left = new Node(23);
        root.right.right = new Node(52);
        root.left.right.right = new Node(12);
        root.right.right.left = new Node(50);;
        sumOfLeftLeaves(root,true);
        System.out.println(sum);
    }
    public static void sumOfLeftLeaves(Node node, boolean isleft) {

        if (node == null)
            return;

        if (isleft) {
            if (node.left == null && node.right == null) {
                sum = sum + node.data;
            }
        }

        sumOfLeftLeaves(node.left,true);
        sumOfLeftLeaves(node.right,false);
    }

}
