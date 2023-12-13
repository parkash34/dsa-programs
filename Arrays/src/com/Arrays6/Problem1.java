package com.Arrays6;

import java.util.Scanner;

public class Problem1 {
    static int[] prefixSum(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    static void print(int[] arr){
        for(int array: arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        print(arr);
        System.out.println("Prefix Sum Array");
        int[] ans = prefixSum(arr);
        print(ans);
    }
}
