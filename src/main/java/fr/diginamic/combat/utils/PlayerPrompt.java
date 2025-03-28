package fr.diginamic.combat.utils;

import java.util.Scanner;

public class PlayerPrompt
{
    static Scanner sc = new Scanner(System.in);

    public static String askName()
    {
        System.out.print("\nYou look strong. What's your name?. . . :");
        String name = sc.next();
        System.out.println("\nGet ready " + name + " an endless hoard of monsters is approaching quickly! Use all of the tools at your disposal to dispose of them! \n\n Good luck!");
        return name;
    }

    public static int askNumber()
    {

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