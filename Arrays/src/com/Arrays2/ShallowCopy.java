package com.Arrays2;

import java.util.Arrays;
// This is an example of Shallow copy..

public class ShallowCopy{
    static void changing_Array(int[] arr){
        //Arrays.fill(arr, 0);
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    static void changingValue(int a){
        a = 9;
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i*2;
        }
        System.out.println("Before Changing");
        printArray(arr);
        changing_Array(arr);
        System.out.println("After Changing");
        printArray(arr);



        int a = 5;
        System.out.println(a);
        changingValue(a);
        System.out.println(a);
    }
}
