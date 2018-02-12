package com.av.BinaryTree;

public class RemoveNodeLessThanGivenDistance {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);

        System.out.println("InOrder Traversal Of Tree" );
        InOrder(node);
        Node root = removeNodes(node,1,4);
        System.out.println("\n  InOrder Traversal of Tree");
        InOrder(root);
    }

    public static Node removeNodes(Node node,int level, int distance){
        if(node == null)return  null;

        node.left = removeNodes(node.left,level+1,distance);
        node.right = removeNodes(node.right,level+1,distance);

        if(node.left == null && node.right == null && level<distance){
            return null;
        }
        return node;
    }

    static void InOrder(Node node) {
        if (node == null) return;
        InOrder(node.left);
        System.out.print(" "+node.data);
        InOrder(node.right);
    }


}

