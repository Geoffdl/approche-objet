package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetObject
{
    /*
    list vs set
    list utile pour index
    set utile notamment jpa. ex en BDD la clef primaire
    selectAll en BDD ajout dans une liste mais erreur de code > un doublon peut intervenir // le set sera toujours
     */
    public static void main(String[] args)
    {
        HashSet<Pays> a = new HashSet<>(Set.of(
                new Pays("USA", 332, 25460),
                new Pays("France", 68, 2782),
                new Pays("Allemagne", 84, 4430),
                new Pays("UK", 67, 3070),
                new Pays("Italie", 59, 2010),
                new Pays("Japon", 125, 4231),
                new Pays("Chine", 1412, 17963),
                new Pays("Russie", 144, 2240),
                new Pays("Inde", 1428, 3730)
        ));

        // Highest GDP per capita
        Pays highestPerCapita = null;
        double maxGdpPerCapita = 0;
        for (Pays country : a)
        {
            double gdpPerCapita = country.getGdp() / country.getPopulation();
            if (gdpPerCapita > maxGdpPerCapita)
            {
                maxGdpPerCapita = gdpPerCapita;
                highestPerCapita = country;
            }
        }
        System.out.println("Highest GDP per capita: " + highestPerCapita.getName() + " with " + maxGdpPerCapita + " billion per million inhabitants");

        // Country with highest total GDP
        Pays highestGdp = a.iterator().next();
        double maxGdp = 0;
        for (Pays country : a)
        {
            if (country.getGdp() > maxGdp)
            {
                maxGdp = country.getGdp();
                highestGdp = country;
            }
        }
        System.out.println("Highest total GDP: " + highestGdp.getName());

        // Find country with smallest GDP and convert its name to uppercase
        Pays smallestGdp = null;
        double minGdp = Integer.MAX_VALUE;
        for (Pays country : a)
        {
            if (country.getGdp() < minGdp)
            {
                minGdp = country.getGdp();
                smallestGdp = country;
            }
        }
        if (smallestGdp != null)
        {
            smallestGdp.setName(smallestGdp.getName().toUpperCase());
        }
        System.out.println("Smallest GDP country (now uppercase): " + smallestGdp.getName());

        // Delete country with highest GDP
        a.remove(highestGdp);

        // Display all remaining countries
        System.out.println("\nAll remaining countries:");
        for (Pays country : a)
        {
            System.out.println(country.getName() + " - Population: " + country.getPopulation() + "M, GDP: " + country.getGdp() + "B");
        }

        
    }
}