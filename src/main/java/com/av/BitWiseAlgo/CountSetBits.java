package com.av.BitWiseAlgo;

public class CountSetBits {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(countOfSetBits(5));
        System.out.println(countSetBits(5));
    }

    /*
    *   Count total number of setBits
    * */
    public static int countSetBits(int num){
        int count = 0;
        while(num>0){
            count += num&1;
            num = num>>1;
        }
        return count;
    }

    /*
        n&n-1 unsets the rightmost bit
        the number of times the bit is unset = total no of set bits
    */
    public static int countOfSetBits(int num){
        int count = 0;
        while (num>0){
            num = num&(num-1);
            count++;
        }
        return count;
    }
}
