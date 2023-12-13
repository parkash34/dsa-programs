package com.Arrays6;

import java.util.Scanner;

public class Problem3 {
    static int arraySum(int[] arr){
        int sum = 0;
        for(int array : arr){
            sum += array;
        }
        return sum;
    }
    static boolean possibleSubArrays(int[] arr){
        int totalSum = arraySum(arr);
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Answer : "+possibleSubArrays(arr));
    }
}
