package com.av.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class LCA {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);
        node.right.right = new Node(6);
        node.right.right.left = new Node(8);

        System.out.println("LCA "+findLCA(node,4,5));
        System.out.println("LCA "+findLCA(node,4,6));
        System.out.println("LCA "+getLCA(node,4,6).data);
    }


    /*
    * Traverse the path to both the nodes
    * extract the node just before mismatch
    * take care of nodes that are not in path
    * */

    public static int findLCA(Node root, int data,int data1){
        List list = new ArrayList();
        List list1 = new ArrayList();
        int j = -1;

        if(!findPathUtil(root,data,list)||!findPathUtil(root,data1,list1)){
            System.out.println("data couldn't be find in the binary tree");
            return j;
        }
        for (int i = 0; i < list.size() && i< list1.size() ; i++) {
            if(list.get(i)!= list1.get(i)){
                j=  (Integer) list.get(i-1);
                break;
            }

        }
        return j;
    }

    public static boolean  findPathUtil(Node node, int data, List list){
        if(node == null){
            return false;
        }

        list.add(node.data);

        if(node.data == data){
            return true;
        }
        if(node.left !=null && findPathUtil(node.left,data,list)){
            return true;
        }
        if(node.right !=null && findPathUtil(node.right,data,list)){
            return  true;
        }
         list.remove(list.size()-1);
        return  false;
    }

    public static Node getLCA(Node node , int data , int data1){
        if(node == null){
            return null;
        }

        if(node.data == data || node.data == data1){
            return node;
        }

        Node leftNode = getLCA(node.left,data,data1);
        Node rightNode = getLCA(node.right,data,data1);

        if(leftNode!=null && rightNode!=null){
            return node;
        }

        return leftNode!=null?leftNode:rightNode;

    }
}
