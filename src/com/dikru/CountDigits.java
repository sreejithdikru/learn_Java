package com.dikru;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Which number you want to check? ");
        int m = in.nextInt();
        int count = 0;
         while (n>0) {
             int rem = n%10;
             if (rem==m) {
                 count++;
             }
             n= n/10;
         }

        System.out.println(count);
    }
}
