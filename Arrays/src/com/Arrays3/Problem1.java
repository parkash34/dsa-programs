package com.Arrays3;

//Find the total no.of pairs in the Array whose sum is equal to the given value x.

import java.util.Scanner;

public class Problem1 {
    static int noOfPairSum(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Arrays ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.println("No.of Pairs : "+noOfPairSum(arr,x));

    }
}
