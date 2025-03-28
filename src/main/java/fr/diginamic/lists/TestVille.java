package fr.diginamic.lists;
/*
Apprenez à manipuler une liste d’objets
• Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
• Créer une classe TestVilles exécutable.
• Dans la méthode main, créez une ArrayList de villes contenant les villes suivantes :
o Nice, 343 000 hab.
o Carcassonne, 47 800 hab.
o Narbonne, 53 400 hab.
o Lyon, 484 000 hab.
o Foix, 9 700 hab.
o Pau, 77 200 hab.
o Marseille, 850 700 hab.
o Tarbes, 40 600 hab.
2
• Recherchez et affichez la ville la plus peuplée
• Supprimez la ville la moins peuplée
• Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
• Affichez enfin la liste résultante
 */

import java.util.ArrayList;
import java.util.Comparator;

public class TestVille
{

    public static void main(String[] args)
    {
        ArrayList<Ville> cities = new ArrayList<>();

        cities.add(new Ville("Nice", 343_000));
        cities.add(new Ville("Carcassonne", 47_800));
        cities.add(new Ville("Narbonne", 53_400));
        cities.add(new Ville("Lyon", 484_000));
        cities.add(new Ville("Foix", 9_700));
        cities.add(new Ville("Pau", 77_200));
        cities.add(new Ville("Marseille", 850_700));
        cities.add(new Ville("Tarbes", 40_600));

        System.out.println("\n" + cities);

        Ville maxInhabitantsCity = cities.get(0);
        Ville city;
        System.out.println("\nCities with pop above 100 000 are :");

        for (Ville ville : cities)
        {
            //Find highest pop city
            if (ville.inhabitants > maxInhabitantsCity.getInhabitants())
            {
                maxInhabitantsCity = ville;
            }
            //Select cities within range and transform string
            if (ville.getInhabitants() >= 100_000)
            {
                city = ville;
                city.setName(city.getName().toUpperCase());
                System.out.print(" " + city.getName() + "; ");
                ;
            }
        }


        cities.sort(Comparator.comparing(Ville::getInhabitants));

        System.out.println("\n\nDeleting the city with lowest population: " + cities.getFirst());
        cities.removeFirst();

        System.out.println("\nSorted by pop :\n" + cities);
        System.out.println("The city with highest pop is: " + maxInhabitantsCity.getName());
    }


}