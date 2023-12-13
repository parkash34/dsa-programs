package com.$2D_Arrays2;

import java.util.Scanner;

//Transpose of Matrix

public class Problem1 {
    static void transposeOfMatrix(int[][] arr,int row, int col){
        int[][] ans = new int[col][row];
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                ans[i][j] = arr[j][i];
            }
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
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("Col : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        print(arr);
        System.out.println("Transpose of a Matrix");
        transposeOfMatrix(arr,row,col);
    }
}
