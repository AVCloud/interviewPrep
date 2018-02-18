package com.av.BinaryTree;

public class HeightFromParentBinaryTree {

    public static void main(String[] args) {
       // int parent[] = {1, 5, 5, 2, 2, -1, 3};
        int parent[] = new int[]{-1, 0, 0, 1, 1, 3, 5};
        System.out.println(getHeight(parent));
    }

    /*
        Create Array depth
        Traverse the array depth for maximum to get the height of Binary Tree
    */
    public static int getHeight(int[] arr) {
        int[] depthArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int element = i;
            if (arr[element]!= -1 && depthArr[arr[element]] != 0    ) {
                depthArr[i] = depthArr[arr[element]] + 1;
            }
            else if(arr[element] ==-1){
                depthArr[i] = 1;
            }else {
                depthArr[i] = getDepth(arr, element);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < depthArr.length; i++) {
            max = Math.max(max, depthArr[i]);
        }
        return max;
    }


    public static int getDepth(int[] arr, int i) {
        int depth = 1;
        while (1 == 1) {
            if (arr[i] == -1) {
                break;
            } else {
                i = arr[i];
            }
            depth = depth + 1;
        }
        return depth;
    }
}
