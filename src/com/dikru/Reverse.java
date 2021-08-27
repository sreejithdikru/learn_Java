package com.dikru;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        int result = 0 ;
        while(a>0) {
            int rem = a%10;
            a = a/10;

            result = result*10 + rem;
        }
        System.out.println(result);


    }
}
