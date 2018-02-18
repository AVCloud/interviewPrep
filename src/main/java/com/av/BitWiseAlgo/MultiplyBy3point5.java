package com.av.BitWiseAlgo;

public class MultiplyBy3point5 {

    public static void main(String[] args) {
        System.out.println(multiplyBy3point5(2));
    }
    /*
    *   3.5 = 4 - .5
    *       = 2^2 - 1/2
    * */
    public static int multiplyBy3point5(int number){
        return ((number << 2) - (number>>1));
    }
}
