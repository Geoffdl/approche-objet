package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // add cities
        mapVilles.put(11, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");


        //Display all keys in the map with a loop
        System.out.println(mapVilles.keySet()); // not a loop

        for (Map.Entry<Integer, String> entry : mapVilles.entrySet())
        {
            System.out.print(entry.getKey() + "; ");
        }
        System.out.println("\n");

        //Display all the values in the map with a loop
        System.out.println(mapVilles.values()); // not a loop

        for (Map.Entry<Integer, String> entry : mapVilles.entrySet())
        {
            System.out.print(entry.getValue() + "; ");
        }
        System.out.println("\n");

        // display mapsize
        System.out.println(mapVilles.size());
    }
}