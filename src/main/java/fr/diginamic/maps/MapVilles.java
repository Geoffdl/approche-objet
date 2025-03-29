package fr.diginamic.maps;

import fr.diginamic.lists.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles
{
    public static void main(String[] args)
    {
        Ville b = new Ville("name", 0);
        HashMap<String, Ville> a = new HashMap<>();

        a.put("Tom", new Ville("Tom", 12, "Veggies", 132131));
        a.put("Pom", new Ville("Pom", 23, "Fruits", 2323223));
        a.put("Grom", new Ville("Grom", 98, "Meat", 4545545));
        a.put("Vrom", new Ville("Vrom", 64, "Trees", 755657));
        a.put("Dom", new Ville("Dom", 33, "Wind", 307897));
        a.put("Slom", new Ville("Slom", 69, "Earth", 98));

        for (Map.Entry<String, Ville> ville : a.entrySet())
        {
            System.out.println(ville.getValue());
        }

        //Get and delete lowest pop city

        Ville lowestPopCity = null;
        String lowestPopKey = null;
        //setting lowest pop
        for (Map.Entry<String, Ville> entry : a.entrySet())
        {
            if (lowestPopCity == null || entry.getValue().getInhabitants() < lowestPopCity.getInhabitants())
            {
                lowestPopCity = entry.getValue();
                lowestPopKey = entry.getKey();
            }
        }
        //deleting
        System.out.println("Removing: " + lowestPopKey);
        
        a.remove(lowestPopKey);

        // display all
        for (Map.Entry<String, Ville> ville : a.entrySet())
        {
            System.out.println(ville.getValue());
        }
    }
}