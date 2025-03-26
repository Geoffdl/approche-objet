package fr.diginamic.lists.test;
/*
Exercice 4
Apprenez à manipuler une liste de chaines de caractères.
• Dans le package listes, créez une classe TestListeString exécutable.
• Dans cette classe instanciez une ArrayList de String contenant les éléments suivants :
o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
• Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
• Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
majuscules.
• Supprimez de la liste les villes dont le nom commence par la lettre N.
• Affichez la liste résultante
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>(List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String longestName = "";

        for (int i = 0; i < a.size(); i++) {
            // Find longest name
            if (a.get(i).length() > longestName.length()) {
                longestName = a.get(i);
            }

            // Convert to uppercase
            a.set(i, a.get(i).toUpperCase());

            // Remove if starts with "N"
            if (a.get(i).startsWith("N")) {
                a.remove(i);
                i--;
            }


        }

        System.out.println("The town with the longest name is: " + longestName + "\n" + a);
    }
}