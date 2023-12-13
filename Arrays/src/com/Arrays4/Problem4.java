package com.Arrays4;

import java.util.Scanner;

public class Problem4 {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int j : arr) {
            freq[j]++;
        }
        return freq;
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

        int[] freqArr = makeFrequencyArray(arr);

        System.out.print("Enter No.of Queries : ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.print("Enter Q : ");
            int x = sc.nextInt();
            if(freqArr[x] > 0){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
            q--;
        }

    }
}
