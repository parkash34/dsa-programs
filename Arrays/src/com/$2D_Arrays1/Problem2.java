package com.$2D_Arrays1;

import java.util.Scanner;

//Multiplication of Matrix
public class Problem2 {

    static void multiplication(int[][] arr1,int row1,int col1,int[][] arr2,int row2,int col2){
        int[][] ans;
        if(col1 == row2){
            ans = new int[row1][col2];
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    for(int k = 0; k < col1; k++){
                      ans[i][j] += (arr1[i][k]*arr2[k][j]);
                    }
                }
            }
        } else {
            System.out.println("Multiplication Not Possible ");
            return;
        }
        print(ans);
    }
    static void print(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row1 : ");
        int row1 = sc.nextInt();
        System.out.print("col1 : ");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        System.out.println("Elements of Array1 ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("row2 : ");
        int row2 = sc.nextInt();
        System.out.print("col2 : ");
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        System.out.println("Elements of Array 2");
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix1");
        print(arr1);
        System.out.println("Matrix2");
        print(arr2);
        System.out.println("Answer Matrix");
        multiplication(arr1,row1,col1,arr2,row2,col2);

    }
}
