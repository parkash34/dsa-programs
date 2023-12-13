package com.Arrays5;

import java.util.Scanner;

public class Problem3 {
    static void swapping(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] Squaring(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        return arr;
    }
    static int[] sorting(int[] arr){
        int[] ans = Squaring(arr);
        int i = 0, j = ans.length-1;
        while(i < j){
            if(arr[i] > arr[j]){
                swapping(arr,i,j);
                j--;
            }
            if(arr[i] <= arr[j]){
                i++;
            }
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        int[] ans = sorting(arr);
        System.out.println("Squared Array");
        printArray(ans);


    }
}
