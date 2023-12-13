package com.Arrays2;

import java.util.Scanner;

//Last Occurrence of an element x
public class Problem2 {
    static int lastOccurrence(int[] arr,int x){
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,9,9,3,0,1,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Last Occurrence of "+x+" : "+lastOccurrence(arr,x));
    }
}
