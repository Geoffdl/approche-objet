package fr.diginamic.lists;

import java.util.ArrayList;

public class FusionListe
{
    public static void main(String[] args)
    {

        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();

        for (int i = 0; i < liste1.size(); i++)
        {
            String data1 = liste1.get(i);
            String data2 = liste2.get(i);
            liste3.add(data1);
            liste3.add(data2);
        }
        System.out.println(liste3);
    }
}