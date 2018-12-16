package com.av.dynamicProgramming;

public class CatalanNumber {
    static int[] arr;

    /**
     * Catalan numbers are found in many interesting problems
     * like 1.  number of binary search trees with given keys
     * 2. number of different combination of matched pairs
     * 3. Count no of full binary trees with n+1 leaves.
     * @param n
     * @return
     */
    public static int getCatalanNumber(int n) {
        if(arr[n] == 0) {
            for (int i = 0; i < n; i++) {
                arr[n] += getCatalanNumber(i) * getCatalanNumber(n - 1 - i);
            }
        }
        return arr[n];
    }

    public static void main(String[] args) {

        // catalan Number for value 2
        for (int i = 2; i < 5; i++) {
            arr = new int[i+1];
            arr[0] = 1;
            arr[1] = 1;
            System.out.println("Catalan number value  for " + i + " = " + getCatalanNumber(i));
        }
    }
}
