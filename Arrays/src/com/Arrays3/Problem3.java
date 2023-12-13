package com.Arrays3;

//Find the unique number in a given Array where all elements are being repeated
// twice with one value being unique.(Positive Values)

import java.util.Scanner;

public class Problem3 {
    static int[] Traversing(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }
    static int UniqueNumber(int[] arr){
        int[] ans = Traversing(arr);
        for(int i = 0; i < ans.length; i++){
            if(ans[i] > 0){
                return ans[i];
            }
        }
        return -1;
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
        System.out.println("Unique Number : "+UniqueNumber(arr));

    }
}
