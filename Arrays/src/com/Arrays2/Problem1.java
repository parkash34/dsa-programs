package com.Arrays2;

//Occurrence of an element x

import java.util.Scanner;

public class Problem1 {
    static int Occurrence(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,9,9,3,0,1,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Occurrence of "+x+" : "+Occurrence(arr,x));



    }
}
