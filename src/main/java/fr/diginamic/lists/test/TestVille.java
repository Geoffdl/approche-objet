package fr.diginamic.lists.test;
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

import fr.diginamic.lists.Ville;

import java.util.ArrayList;
import java.util.Comparator;

public class TestVille {

    public static void main(String[] args) {

        ArrayList<Ville> cities = new ArrayList<>();

        cities.add(new Ville("Nice", 343_000));
        cities.add(new Ville("Carcassonne", 47_800));
        cities.add(new Ville("Narbonne", 53_400));
        cities.add(new Ville("Lyon", 484_000));
        cities.add(new Ville("Foix", 9_700));
        cities.add(new Ville("Pau", 77_200));
        cities.add(new Ville("Marseille", 850_700));
        cities.add(new Ville("Tarbes", 40_600));

        System.out.println(cities);

        Ville maxInhabitantsCity = cities.get(0);


        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).inhabitants > maxInhabitantsCity.getInhabitants()) {
                maxInhabitantsCity = cities.get(i);
            }

            if (cities.get(i).getInhabitants() >= 100_000) {
                Ville city = cities.get(i);
                city.setName(city.getName().toUpperCase());
            }
        }

        cities.sort(Comparator.comparing(Ville::getInhabitants));
        cities.removeFirst();

        System.out.println("Sorted by pop :\n" + cities);
        System.out.println("The city with highest pop is: " + maxInhabitantsCity);
    }


}