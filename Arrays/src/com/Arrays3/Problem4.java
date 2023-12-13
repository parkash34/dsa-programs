package com.Arrays3;

//Find the second-largest element in the given Array

import java.util.Scanner;

public class Problem4 {


    //1st way
    static int FirstLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int SecondLargest(int[] arr){
        int max = FirstLargest(arr);
        for(int i = 0; i < arr.length; i++){
            if(max == arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        max = FirstLargest(arr);
        return max;
    }

    //2nd way
    static int[] SortedArray(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int SecondMax(int[] arr){
        int[] ans = SortedArray(arr);
        return ans[ans.length-2];
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
       // System.out.println("Second Largest : "+SecondLargest(arr));
        System.out.println("Second Max : "+SecondMax(arr));
    }
}
