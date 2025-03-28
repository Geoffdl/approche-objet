package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString
{
    public static void main(String[] args)
    {
        HashSet<String> a = new HashSet<>(Set.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

        // Find country with most characters
        String longestName = "";
        for (String country : a)
        {
            if (country.length() > longestName.length())
            {
                longestName = country;
            }
        }
        System.out.println("Longest name: " + longestName);

        // Delete it
        a.remove(longestName);

        // Display all remaining countries
        System.out.println("Remaining countries: " + a);
    }
}