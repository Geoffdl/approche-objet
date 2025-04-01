package fr.diginamic.recensement.services;

import fr.diginamic.recensement.model.Recensement;
import fr.diginamic.recensement.model.Region;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AffichageTopRegions extends MenuService
{
    /**
     * Affichage des N régions les plus peuplées;
     *
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        HashMap<String, Integer> mapRegions = Region.getRegionPopulation(recensement);

        System.out.print("Combien de régions souhaitez vous voir les régions triées ? : ");
        String limit = scanner.nextLine();
        int limitToInt = parseInt(limit);
        System.out.println("Top 10 region les plus peuplés:");
        mapRegions.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(limitToInt)
                .forEach(entry -> System.out.printf("Region %s: %,d habitants%n",
                        entry.getKey(),
                        entry.getValue()));

        System.out.println("\nAppuyez sur Entrée pour continuer...");
        scanner.nextLine();
    }
}