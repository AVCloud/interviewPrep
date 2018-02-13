package com.av.BitWiseAlgo;

public class CheckOverflow {


    public static void main(String[] args) {
        int result = add(Integer.MAX_VALUE,2);
        System.out.println("result of addition of two numbers "+result);
    }

    private static int add(int a,int b){
        if(a>Integer.MAX_VALUE-b){
            return -1;
        }else{
            return a+b;
        }

    }
}
