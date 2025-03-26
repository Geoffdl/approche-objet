package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre
{
    public static void main(String[] args)
    {
        Theatre t = new Theatre("Lux", 70);

        int i = 0;
        while (i < 8)
        {
            t.register(10, 50);
            i++;
        }

        System.out.println();
        System.out.println("Total revenue: " + t.getRevenue() + "€");
        System.out.println("There are " + t.getClientsRegistered() + " clients registered for the play in " + t.getName() + ".");
    }
}