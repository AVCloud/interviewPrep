package com.av.BitWiseAlgo;

public class FlippedBits {

    public static void main(String[] args) {
        System.out.println(noOfFlipBits(4, 3));
        System.out.println(noOfFlipBits(4, 5));
    }

    /*
     *  4 = 100
     *  5 = 101
     *  4^5 = 001
     *  no of bits set in 4^5 corresponds to the number of times bits need to flipped
     * */
    public static int noOfFlipBits(int x, int y) {
        return getCountOfSetBits(x ^ y);
    }

    public static int getCountOfSetBits(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
