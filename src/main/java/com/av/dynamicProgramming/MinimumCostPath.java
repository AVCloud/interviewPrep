package com.av.dynamicProgramming;

import java.util.Arrays;

public class MinimumCostPath {

    public static int[][] matrix = {{1,9,11},{2,8,4},{6,3,5}};

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = -1;
            }
        }
        System.out.println(minPath( 2, 2));
        System.out.println(minPath(arr, 2, 2));
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
            }

            printPath(arr,0,0);
        }

    public static int minPath(int m, int n) {
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        } else if (m == 0 && n == 0) {
            return matrix[m][n];
        }
        return Math.min(Math.min(minPath(m - 1, n - 1), minPath(m, n - 1)), minPath(m - 1, n)) + matrix[m][n];
    }


    public static int minPath(int[][] cost, int m, int n) {
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        if (cost[m][n] == -1) {
            if (m == 0 && n == 0) {
                cost[m][n] = matrix[m][n];
            } else {
                cost[m][n] = Math.min(Math.min(minPath(cost, m - 1, n - 1), minPath(cost, m, n - 1)), minPath(cost, m - 1, n)) + matrix[m][n];
            }
        }
        return cost[m][n];
    }


    public static void printPath(int[][] arr,int m, int n){
        if(m <0|| n<0){
            return;
        }
        if(m==2&&n==2){
            System.out.println(matrix[m][n]);
            return;
        }
        else if(arr[m+1][n]<arr[m][n+1]){
            if(arr[m+1][n] < arr[m+1][n+1]){
                System.out.println(matrix[m+1][n]);
                printPath(arr,m+1,n);
            }
            else {
                System.out.println(matrix[m+1][n+1]);
                printPath(arr,m+1,n+1);
            }
        }else if(arr[m+1][n+1] < arr[m][n+1]){
            System.out.println(matrix[m+1][n+1]);
            printPath(arr,m+1,n+1);
        }
        else {
            System.out.println(matrix[m][n+1]);
            printPath(arr,m,n+1);
        }
    }

}
