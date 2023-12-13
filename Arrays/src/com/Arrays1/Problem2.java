package com.Arrays1;

//Max number in Array

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,5,9,0};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Value :"+max);
    }
}
