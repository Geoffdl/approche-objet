package fr.diginamic.testenumeration;

import fr.diginamic.lists.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum
{
    public static void main(String[] args)
    {
        List<Ville> cities = new ArrayList<>();

        cities.add(new Ville("New York", 330_000, Continent.AMERICA));
        cities.add(new Ville("Paris", 330_000, Continent.EUROPE));
        cities.add(new Ville("Pékin", 330_000, Continent.ASIA));
        cities.add(new Ville("Moscou", 330_000, Continent.ASIA));
        cities.add(new Ville("Berlin", 330_000, Continent.EUROPE));
        cities.add(new Ville("Sydney", 330_000, Continent.OCEANIA));
        cities.add(new Ville("Sao Paulo ", 330_000, Continent.AMERICA));
        cities.add(new Ville("Dakar", 330_000, Continent.AFRICA));

        //Cities per continent
        for (Continent continent : Continent.values())
        {
            System.out.println("\n" + continent + ":");
            for (Ville ville : cities)
            {
                if (ville.getContinent() == continent)
                {
                    System.out.println("\t" + ville.getName());
                }
            }
        }

    }


}