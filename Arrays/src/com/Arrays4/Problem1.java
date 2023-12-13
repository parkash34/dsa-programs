package com.Arrays4;

//Swapping a and b

import java.util.Scanner;

public class Problem1 {

    //1st way...
    static void Swapping1(int a, int b){
        System.out.println("** Before Swapping **");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        int temp = a;
        a = b;
        b = a;
        System.out.println("** After Swapping **");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }


    //2nd way...
    static void Swapping2(int a, int b){
        System.out.println("** Before Swapping **");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("** After Swapping **");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
     //   Swapping1(a,b);
        Swapping2(a,b);

    }
}
