package com.dikru;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("Hello buddy Welcome foolish calc");
        while(true) {
            System.out.println("enter x to quit or enter an operator to calculate");
            System.out.print("Enter an operator: ");
            char op = in.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op =='%') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    ans = num1/num2;
                }
                if (op=='%'){
                    ans = num1%num2;
                }
            }
            else if (op=='x' || op == 'X') {
                System.out.println("Thank you for trying this out");
                break;

            }
            else {
                System.out.println("Invalid operator bro");
            }
            System.out.println(ans);
        }
    }
}
