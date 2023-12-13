package com.Arrays1;

import java.util.Scanner;

//Search number in Array

public class Problem3 {
    static int SearchingNumber(int[] arr,int num){
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,0};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Index : "+SearchingNumber(arr,num));
    }
}
