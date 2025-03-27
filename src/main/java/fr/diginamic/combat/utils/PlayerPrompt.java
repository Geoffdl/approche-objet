package fr.diginamic.combat.utils;

import java.util.Scanner;

public class PlayerPrompt
{
    static Scanner sc = new Scanner(System.in);

    public static String askName()
    {
        System.out.print("You look strong. What's your name?. . . :");
        String name = sc.next();
        return name;
    }

    public static int askNumber()
    {
        System.out.print("Enter your choice (1 to continue 2 to quit): ");
        int choice = sc.nextInt();
        return choice;
    }
}