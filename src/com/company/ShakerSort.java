package com.company;

import java.util.Arrays;

public class ShakerSort {

    public static int[] arr = {56, 1, 67, 8, 888, 551};
    public static int counter = 0;
    public static boolean isSwapped = false;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        shakerSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }

    public static void shakerSort(int[] A ) {
        int temp;
        int max = arr.length - 1;
        int min = 0;
        while (min<max){
            isSwapped = false;
            for (int i = min; i < max ; i++) {
                counter++;
                if(A[ i ] > A[ i+1] ) {
                    temp = A[ i ];
                    A[ i ] = A[ i+1 ];
                    A[ i + 1] = temp;
                    isSwapped = true;
                }
            }
            max--;
            for (int i = max; i > min ; i--) {
                counter++;
                if(A[ i ] < A[ i-1] ) {
                    temp = A[ i ];
                    A[ i ] = A[ i-1 ];
                    A[ i - 1] = temp;
                    isSwapped = true;
                }
            }
            min++;
            if (!isSwapped) break;
        }
        }
    }

