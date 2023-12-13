package com.Arrays3;

//Find the No.of Triples whose sum is equal to the given value x.

import java.util.Scanner;
public class Problem2 {
    static int NoOfTriplesSum(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1 ; k < arr.length; k++){
                    if (arr[i] + arr[j]+arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Elements of Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.println("No.of Triples : "+NoOfTriplesSum(arr,x));
    }
}
