package com.Arrays2;

public class Important {
    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,8,2,5};
        System.out.println("Printing Original Array");
        printArray(arr1);

        int[] arr2 = arr1;
        System.out.println("Printing Copied Array");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 1;

        System.out.println("Printing Original Array After Changing copied array");
        printArray(arr1);
        System.out.println("Printing copied array after changing copied array");
        printArray(arr2);




        // This is happening because of memory allocation;
        // it's detail has been written on copy check that
    }
}
