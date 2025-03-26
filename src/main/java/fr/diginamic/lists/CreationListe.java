package fr.diginamic.lists;

import java.util.ArrayList;

public class CreationListe
{
    public static void main(String[] args)
    {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 100; i++)
        {
            a.add(i);
        }
        System.out.println("a à une taille de : " + a.size() + "\na contient " + a);
    }
}