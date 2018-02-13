package com.av.BitWiseAlgo;

public class NumberOccuringOddNumberOfTimes {

    public static void main(String[] args) {
        int arr[] ={2,5,5,5,3,4,2,3,4};
        System.out.println(OddNumber(arr));
    }

    private static int OddNumber(int[] arr){
        int result = 0;
        for (int i = 0; i <arr.length ; i++) {
            result = result^arr[i];
        }
        return result;
    }

}
