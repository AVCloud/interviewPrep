package com.av.BitWiseAlgo;

public class ModulousOF2 {

    public static void main(String[] args) {
        System.out.println(getModoulo(5,2));
    }
/*
*   n = 6 (110)
*   d= 4 (100)
*
*   need to return last two bit
* */
    public static  int getModoulo(int number,int divisor){
        return (number&(divisor-1));
    }
}
