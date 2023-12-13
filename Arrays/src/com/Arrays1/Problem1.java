package com.Arrays1;

// Sum of elements


public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1,4,9};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
