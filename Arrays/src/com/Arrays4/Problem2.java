package com.Arrays4;

//Reversing an Array

import java.util.Scanner;

public class Problem2 {

    //1st way (IN PLACE Method)
    static int[] ReversedArray1(int[] arr){
        int i = 0, j = arr.length-1;
        while (j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    //2nd way
    static int[] ReversedArray2(int[] arr){
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i >= 0; i--){
            ans[j] = arr[i];
            j++;
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
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements of Array ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array :");
        printArray(arr);
        System.out.print("Reversed Array : ");

//        int[] ans = ReversedArray1(arr);
//        printArray(ans);

        int[] ans2 = ReversedArray2(arr);
        printArray(ans2);
    }
}
