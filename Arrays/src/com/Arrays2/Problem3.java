package com.Arrays2;

//Count the numbers of elements strictly greater than value x

import java.util.Scanner;

public class Problem3 {
    static int greaterNumbers(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
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
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        System.out.println("No.of Greater "+x+" : "+greaterNumbers(arr,x));

    }
}
