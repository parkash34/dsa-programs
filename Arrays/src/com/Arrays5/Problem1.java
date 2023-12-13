package com.Arrays5;

//Sorting a binary array..

import java.util.Scanner;
public class Problem1 {

    //1st way..
    static int[] BinaryNumberSorting(int[] arr){
        //0 0 1 1 1 0
        int zeros = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i < zeros){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }


        return arr;
    }

    //2nd way...
    static int[] BinaryNumberSorting2(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    //3rd way
    static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] BinaryNumberSorting3(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            } else if (arr[i]==0) {
                i++;
            } else if (arr[j]==1) {
                j--;
            }
        }
        return arr;
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

        printArray(arr);

        int[] ans = BinaryNumberSorting(arr);
        printArray(ans);

    }
}
