package com.Arrays2;

import java.util.Arrays;

public class DeepCopy {
    static void changingArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,9,4,2};

        //1st way by using clone method
        int[] arr2 = arr1.clone();

        //2nd way by using copyOf method of Arrays
        int[] arr3 = Arrays.copyOf(arr1,arr1.length);

        //3rd way by using copyOfRange method of Arrays
        //                              array, [        )
        int[] arr4 = Arrays.copyOfRange(arr1,0,arr1.length);

        System.out.println("Original Array");
        printArray(arr1);
        System.out.println("Copied Array");
        printArray(arr2);

        changingArray(arr2);

        System.out.println("Original Array After Changing Copied one");
        printArray(arr1);
        System.out.println("Copied Array After Changing copied one");
        printArray(arr2);


    }
}
