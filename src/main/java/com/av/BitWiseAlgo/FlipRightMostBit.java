package com.av.BitWiseAlgo;

public class FlipRightMostBit {

    public static int filpRightMostBit(int number){
        return  number & (number-1);
    }
}
