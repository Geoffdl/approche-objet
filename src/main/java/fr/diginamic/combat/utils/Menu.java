package fr.diginamic.combat.utils;

public class Menu
{
    public Menu()
    {
    }

    public static void idleMenu()
    {
        System.out.println("Get ready before the next fight !");
        System.out.println("1 to proceed, 2 to check stats, 3 to quit game");
        PlayerPrompt.askNumber();
    }

    public static void statusMenu()
    {

        System.out.println("");
    }

    public static void fightingMenu()
    {

    }
}