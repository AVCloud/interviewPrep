package com.av.BinaryTree;

public class Maximum {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(65);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);
        System.out.println(getMax(node,Integer.MIN_VALUE));
    }

    public static int getMax(Node node,int max){
        if(node == null){
            return max;
        }
        if(node.data > max){
            max = node.data;
        }
        return Math.max(getMax(node.left,max),getMax(node.right,max));
    }
}
