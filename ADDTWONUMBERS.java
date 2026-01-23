package com.Java;

import java.util.Scanner;

public class Himanshu {
    public static void main(String[] args) {

        // two add number  -- number 1 , nm 2 , add result ;;;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your number2 : ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
      System.out.println("The sum of two numbers " + result );

    }
}
