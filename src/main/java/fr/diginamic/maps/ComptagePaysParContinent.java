package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent
{
    public static void main(String[] args)
    {
        ArrayList<Pays> al = new ArrayList<>();
        al.add(new Pays("France", 6.5e7, "Europe"));
        al.add(new Pays("Germany", 8e7, "Europe"));
        al.add(new Pays("Belgium", 1e7, "Europe"));
        al.add(new Pays("Russia", 1.5e8, "Asia"));
        al.add(new Pays("China", 1.4e9, "Asia"));
        al.add(new Pays("Indonesia", 2.2e8, "Oceania"));
        al.add(new Pays("Australia", 2e7, "Oceania"));

        System.out.println(al.getLast().getInhabitants());


        //count number of countries per continents using hashmap
        HashMap<String, Integer> countCountriesPerContinent = new HashMap<>();

        for (Pays pays : al)
        {
            String continent = pays.getContinent();
            countCountriesPerContinent.put(continent,
                    countCountriesPerContinent.getOrDefault(continent, 0) + 1);
        }
        System.out.println(countCountriesPerContinent);


    }
}