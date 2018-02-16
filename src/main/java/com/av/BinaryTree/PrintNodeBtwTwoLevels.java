package com.av.BinaryTree;

public class PrintNodeBtwTwoLevels {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);
        printNodeBtwTwoLevels(node,2,3,1);
    }
    public static void printNodeBtwTwoLevels(Node node,int lowerLevel,int uppperLevel ,int level){
        if(node == null){
            return;
        }
        if(level >= lowerLevel && level <= uppperLevel){
            System.out.println(node.data);
        }
        printNodeBtwTwoLevels(node.left,lowerLevel,uppperLevel,level+1);
        printNodeBtwTwoLevels(node.right,lowerLevel,uppperLevel,level+1);
    }

}
