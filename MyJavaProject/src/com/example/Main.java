package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
       
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number");                 
        } else {
            System.out.println(num + " is an Odd number");
        }

        s.close();
    }
}
