package com.dikru;

import java.util.Scanner;

public class IsArmstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Starting number?");
        int x = in.nextInt();
        System.out.println("Ending number");
        int y = in.nextInt();

        for (int i = x; i < y; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

}