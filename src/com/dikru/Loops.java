package com.dikru;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //find largest of 3 numbers
        int max = a;
        if (max<b) {
            max = b;
        }
        if (max<c) {
            max = c;
        }
        System.out.println(max);
    }
}
