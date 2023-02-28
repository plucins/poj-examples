package com.company;

import java.util.Scanner;

public class IncrementExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = 0;
        System.out.println("Podaj 5 liczb");

        for (int i = 0; i<5; i++) {
            input+= scan.nextInt();
        }

        System.out.println(input);
    }
}
