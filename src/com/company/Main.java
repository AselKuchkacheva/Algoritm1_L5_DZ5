package com.company;

import java.util.Arrays;

public class Main {

    public static int[] arr = {56, 1, 67, 8, 888, 551};

    public static int counter = 0;
    public static boolean isSwapped = false;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        bubble_sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);

    }

    public static void bubble_sort(int[] A, int n ) {
        int temp;
        for(int k = 0; k< n-1; k++) {
            isSwapped = false;
            for(int i = 0; i < n-k-1; i++) {
                counter++;
                if(A[ i ] > A[ i+1] ) {
                    temp = A[ i ];
                    A[ i ] = A[ i+1 ];
                    A[ i + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}
