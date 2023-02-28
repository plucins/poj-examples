package com.company;

public class CastingExample {

    public static void main(String[] args) {

        short myShort = 5000;
        int myInt = 50000000;
        long myLong = 50000000;
        char myChar = 'A';

        System.out.println((int) myShort);
        System.out.println((float) myInt);
        System.out.println((short) myInt);
        System.out.println((int) myLong);
        System.out.println((byte) myShort);
        System.out.println((int) myChar);

        System.out.println(5 / 4);
        System.out.println(5.0 / 4);


    }
}
