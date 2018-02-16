package com.av.BinaryTree;

public class CousinsBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(cousin(root, 4, 5));
    }

    public static boolean cousin(Node node, int data, int data1) {

        return !isSibling(node,data,data1)&&(level(node, data, 1) == level(node, data1, 1));
    }

    public static boolean isSibling(Node node, int data, int data1) {
        if (node == null) {
            return false;
        }
        return (((node.left!=null && node.right!=null)&&((node.left.data == data && node.right.data == data1) || (node.right.data == data && node.left.data == data1))) || (isSibling(node.left, data, data1)) || (isSibling(node.right, data, data1)));
    }

    public static int level(Node node, int data, int level) {
        if (node == null) {
            return 0;
        }
        if (node.data == data) {
            return level;
        }
        int left = level(node.left, data, level + 1);
        int right = level(node.right, data, level + 1);
        if (left != 0 ){
            return left;
        }else if( right != 0) {
            return right;
        }
        return 0;
    }

}
