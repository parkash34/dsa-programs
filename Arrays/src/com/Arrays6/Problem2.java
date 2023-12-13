package com.Arrays6;

import java.util.Scanner;

public class Problem2 {
    static int PrefixSumQueries(int[] arr,int l,int r){
        int sum = 0;
        for(int i = l; i <= r; i++){
            sum += arr[i];
        }
        return sum;
    }
    static void print(int[] arr){
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Elements of Array");
        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        print(arr);
        System.out.print("No.of Queries : ");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.print("Enter Range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("SUM : "+PrefixSumQueries(arr,l,r));
        }
    }
}
