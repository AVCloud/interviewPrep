package com.av.BitWiseAlgo;

public class BinaryRepresentation {

    public static void main(String[] args) {
        binary(6);
    }

    public static void binary(int n){

        if(n>1)
            binary(n/2);

        System.out.println(n%2);
    }
}
