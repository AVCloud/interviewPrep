package com.av.BitWiseAlgo;

public class AddOneToNumber {

/*
*   -ve numbers are represented as 2 complement in most architechtures
*   e.g.  number 2 negative number is , -2
*    -2 = ~2+1
*    replace 2 with (~2)
*   -(~2) = 2+1
*
* */

    public static void main(String[] args) {
        int n = 12;
        System.out.println(-(~n));
    }


}
