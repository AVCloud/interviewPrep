package com.av.BitWiseAlgo;

public class RotateBitsOfNumber {


    public static void main(String[] args) {
        byte n = 24;
        byte d = 3;
        leftRotate(n,d);
        rightRotate(n,d);
    }

    public static byte leftRotate(byte n,byte d){
        return (byte)( n<<d | n >> (8-d));
    }

    public static byte rightRotate(byte n,byte d){
        return (byte)( n>>d | n << (8-d));
    }
}
