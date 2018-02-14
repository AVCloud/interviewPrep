package com.av.BitWiseAlgo;

public class ModulousOF2 {

    public static void main(String[] args) {
        System.out.println(getModoulo(5,2));
    }

    public static  int getModoulo(int number,int divisor){
        return (number&(divisor-1));
    }
}
