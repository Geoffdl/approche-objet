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
        System.out.print("Enter your choice: ");
        int choice = 0;
        boolean validInput = false;

        while (!validInput)
        {
            System.out.print("Enter your choice: ");
            try
            {
                String input = sc.nextLine();
                choice = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e)
            {
                System.out.println("Please enter a valid number.");
            }
        }

        return choice;
    }
}