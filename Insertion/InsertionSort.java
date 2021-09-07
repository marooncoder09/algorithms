package com.apnacollege;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,11,9,0};
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(nums));
       InsertionSortAlgo(nums);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(nums));

    }
    static void InsertionSortAlgo(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
