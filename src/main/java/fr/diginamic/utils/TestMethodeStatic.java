package fr.diginamic.utils;

import static java.lang.Integer.*;

public class TestMethodeStatic {

    public static void main(String[] args) {

        String myString = "42";

        System.out.println(myString + myString);

        int myInt = parseInt(myString); // radix is ?

        System.out.println(myInt + myInt);

        int a = 10;
        int b = 20;
        int maxVal = max(a,b);
        System.out.println(maxVal);

    }
}