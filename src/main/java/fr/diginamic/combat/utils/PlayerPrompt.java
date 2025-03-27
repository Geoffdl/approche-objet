package fr.diginamic.combat.utils;

import java.util.Scanner;

public class PlayerPrompt
{
    static Scanner sc = new Scanner(System.in);

    public static String askName()
    {
        System.out.print("You look strong. What's your name?. . . ");
        String name = sc.next();
        return name;
    }
}