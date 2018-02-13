package com.av.BinaryTree;

public class DistanceBetweenTwoNodes {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);
        System.out.println(distanceBetweenTwoNodes(node,3,4));
        System.out.println(distanceBetweenTwoNodes(node,2,3));
    }

    public static int distanceBetweenTwoNodes(Node node, int data, int data1) {

        Node node1 = findLca(node,data,data1);
        return findheight(node1,data,0)+findheight(node1,data1,0);
    }

    public static int findheight(Node node , int data, int level){
        if(node == null || node.data == data){
            return level;
        }
        return Math.min(
        findheight(node.left,data,level+1),
        findheight(node.right,data,level+1));

    }

    public static Node findLca(Node node, int data, int data1) {
        if (node == null) {
            return null;
        }
        if (node.data == data || node.data == data1) {
            return node;
        }

        Node leftNode = findLca(node.left, data, data1);
        Node rightNode = findLca(node.right, data, data1);

        if (leftNode != null && rightNode != null) {
            return node;
        }
        return leftNode != null ? leftNode : rightNode;
    }

}
