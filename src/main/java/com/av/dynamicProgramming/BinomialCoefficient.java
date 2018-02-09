package com.av.dynamicProgramming;

public class BinomialCoefficient {


    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        System.out.println(binomialCoefficient(4,2));
        System.out.println(binomialCoefficient(4,2,arr));
        System.out.println(binoCoefficient(4,2));
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

    /*
        Lesser Space Complexity
    * */
    public static int binoCoefficient(int n , int k){
        int [] res = new int [k+1];
        res[0] = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = Math.min(i,k); j >0 ; j--) {
                res[j] = res[j]+res[j-1];
            }
        }
        return  res[k];
    }
}
