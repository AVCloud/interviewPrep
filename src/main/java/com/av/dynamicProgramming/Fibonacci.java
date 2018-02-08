package com.av.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by Anuj on 2/7/2018.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib(6));
        System.out.println(fib(0));
        int[]arr = new int[100];
        Arrays.fill(arr,-1);
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib(4,arr));
    }
/*Time complexity = exponential*/
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    /*Time Complexity O(n)*/

    public static int fib(int n,int[]arr){
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n] = fib(n-1,arr)+fib(n-2,arr);
        return arr[n];
    }

    /*Matrix Solution {{1,1},{1,0}}
    * Time Complexity = Log(N)
    * */


}
