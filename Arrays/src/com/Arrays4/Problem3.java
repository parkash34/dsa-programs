package com.Arrays4;

//Rotate the given array by k steps, where k is non-negative.
// Note: K can be greater than n as well.

import java.util.Scanner;
public class Problem3 {

    //1st way
    static int[] RotateByK1(int[] arr, int k){
       int n = arr.length;
       k = k%n;
       int[] ans = new int[n];
       int j = 0;
       for(int i = n-k; i < n ; i++){
           ans[j++] = arr[i];
       }
       for(int i = 0; i < n-k; i++){
           ans[j++] = arr[i];
       }
       return ans;
    }

    //2nd way

   static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
   }
   static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
   }
   static int[] RotateByK2(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
        return arr;
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
        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K : ");
        int k = sc.nextInt();

        System.out.print("Original Array :");
        printArray(arr);
        int[] ans = RotateByK2(arr,k);
        System.out.print("After Rotation : ");
        printArray(ans);
    }
}
