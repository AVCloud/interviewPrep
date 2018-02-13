package com.av.BinaryTree;

public class PrintAncestors {

        /*
        *           1
        *       2       3
        *     4   5         6
        *    7          8
        * */
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);
        printAncestors(node,7);
    }


    public static boolean printAncestors(Node node , int data){
        if(node == null){
            return false;
        }
        if(node.data == data){return true;}

        if(printAncestors(node.left,data)||printAncestors(node.right,data)){
            System.out.println(node.data);
            return true;
        }

        return false;
    }
}
