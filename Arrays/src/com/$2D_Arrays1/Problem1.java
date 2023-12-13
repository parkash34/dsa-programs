package com.$2D_Arrays1;

import java.util.Scanner;

//Addition of Matrix

public class Problem1 {
    static void Addition(int[][] arr1,int row1,int col1, int[][] arr2,int row2,int col2){
        if(row1 != row2 || col2 != col1){
            System.out.println("Wrong Input - Addition Not possible");
            return;
        }
        int[][] sum = new int[row1][col1];
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        print(sum);
    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row1 : ");
        int row1 = sc.nextInt();
        System.out.print("Enter col1 : ");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        System.out.println("Element of Array 1");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row2 : ");
        int row2 = sc.nextInt();
        System.out.print("Enter col2 : ");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        System.out.println("Elements of Arrays 2 ");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Matrices ");
        Addition(arr1,row1,col1,arr2,row2,col2);



    }
}
