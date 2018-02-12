package com.av.dynamicProgramming;

import java.util.Arrays;

public class LargestCommonSubsequence {

    public static void main(String[] args) {
        String s1 = "GXTXAYB";
        String s2 = "XYXTDB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println("Largest common subsequence is "+lcs(X,m,Y,n));
        int[][] arr = new int[m+1][n+1];
        for (int[] ints : arr) {
            for (int i = 0; i < ints.length ; i++) {
                ints[i] = -1;
            }
        }
        System.out.println("Largest common subsequence is "+lcs(X,m,Y,n,arr));
        System.out.println("Largest common subsequence is "+bottomUPLcs(X,Y,m,n,arr));
        System.out.printf("Print the LCS String "+lcsString(arr,X,Y,m,n));
    }

    public static int lcs(char[] str,int m,char[] str1, int n){
        if(m<=0|| n<=0){
            return 0;
        }
        if(str[m-1] == str1[n-1]){
            return 1+lcs(str,m-1,str1,n-1);
        }
        else{
            return Math.max(lcs(str,m-1,str1,n),lcs(str,m,str1,n-1));
        }
    }

/*
*   Top Down approach
* */
    public static int lcs(char[] str,int m,char[] str1, int n,int[][]arr){

        if(arr[m][n]== -1) {
            if(m<=0|| n<=0){
                arr[m][n] = 0;
            }
            else if (str[m - 1] == str1[n - 1]) {
                return  1 + lcs(str, m - 1, str1, n - 1);
            } else {
                arr[m][n] = Math.max(lcs(str, m - 1, str1, n), lcs(str, m, str1, n - 1));
            }
        }
        return arr[m][n];
    }

    /*
    * Bottom up approach (Memoization)
    * take care of comparing the strings that is the vital part
    *
    * */
    public static int bottomUPLcs(char[] str, char[]str1,int m, int n,int[][]arr){
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0 || j==0){
                    arr[i][j] = 0;
                }
                else if(str[i-1] == str1[j-1]){
                    arr[i][j] = 1+ arr[i-1][j-1];
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }

        }

        return arr[m][n];
    }


    /*printing the LCS String*/
    public static String lcsString(int[][] arr,char[]ch,char[] ch1,int m,int n){
        int j = n;
        int i = m;
        String str = "";
        while (i>0&& j>0){
            if(ch[i-1] == ch1[j-1]){
                str=ch[i-1]+str;
                i--;
                j--;
            }else if(arr[i-1][j] > arr[i][j-1]){
                i--;
            }
            else {
                j--;
            }

        }
        return str;
    }
}
