package com.Arrays2;

//followup question

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    //1st way
    static int[] smallestAndLargest(int[] arr){
        int[] ans = new int[2];
        int max = arr[0], min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }

    //2nd Way
    static int[] smallestAndLargest2(int[] arr){
        Arrays.sort(arr);
        int[] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[arr.length-1];
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
        System.out.println("Elements of Arrays ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First Array ");
        printArray(arr);
        int[] ans = smallestAndLargest(arr);
        System.out.println("Second Array ");
        printArray(ans);

        System.out.println("Array ");
        printArray(arr);
        System.out.println("Second Array");
        int[] ans2 = smallestAndLargest2(arr);
        printArray(ans2);






    }
}
