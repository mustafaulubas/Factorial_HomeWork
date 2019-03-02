package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Please write a number that you want the factorial of it: ");
        int number = new Scanner(System.in).nextInt();
        int x = number;
        int result = 1;

        if (number == 0){
            System.out.println("The factorial of 0 is: 1");
        }else if (number < 0){
            throw new Exception("Please enter a valid number which is bigger than zero!");
        }else if (number > 0){
            while(number != 0){
                result = result*(number);
                number--;
            }
            System.out.println("The factorial of " + x + " is: " + result);
        }

    }
}

// this is an iteration solution of this problem