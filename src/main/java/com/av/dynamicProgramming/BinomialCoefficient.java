package com.av.dynamicProgramming;

public class BinomialCoefficient {


    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        System.out.println(binomialCoefficient(4,2));
        System.out.println(binomialCoefficient(4,2,arr));
    }

/*
    Time Complexity O(n) = 2^n

*/
    public static int binomialCoefficient(int n , int k){
        if(k==0 || n == k){
            return 1;
        }else if(k>n){
            return -1;
        }
        return binomialCoefficient(n-1,k-1)+binomialCoefficient(n-1,k);
    }

    public static int binomialCoefficient (int n, int k , int [][]arr){

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= Math.min(i,k) ; j++) {
                if(j ==0 || j == i){
                    arr[i][j]= 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        return arr[n][k];
    }
}
