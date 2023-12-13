package com.Arrays5;

import java.util.Scanner;

public class Problem2 {
    static int[] evenOdd(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;
            } else if (arr[i]%2==0) {
                i++;
            } else if (arr[j]%2==1) {
                j--;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr){
        for(int array: arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array ");
        print(arr);
        System.out.println("Sorted Array");
        int[] ans = evenOdd(arr);
        print(ans);


    }
}
