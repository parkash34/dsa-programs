package com.Arrays2;

//Check if the given array is sorted or not (increasing order)

import java.util.Scanner;

public class Problem4 {
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
              check = false;
              break;
            }
        }
        return check;
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
        System.out.println("Sorted : "+isSorted(arr));
    }
}
