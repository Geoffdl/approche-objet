package fr.diginamic.recensement.services;

import fr.diginamic.recensement.model.Recensement;
import fr.diginamic.recensement.model.Region;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AffichageTopDepartements extends MenuService
{
    /**
     * Affichage des N départements les plus peuplés
     *
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        HashMap<String, Integer> mapDepartments = Region.getRegionPopulation(recensement);

        System.out.print("Combien de départements souhaitez-vous voir les départements triés ? : ");
        String limit = scanner.nextLine();
        int limitToInt = parseInt(limit);
        System.out.println("Top 10 départements les plus peuplés:");
        mapDepartments.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(limitToInt)
                .forEach(entry -> System.out.printf("Département %s: %,d habitants%n",
                        entry.getKey(),
                        entry.getValue()));
        

        System.out.println("\nAppuyez sur Entrée pour continuer...");
        scanner.nextLine();
    }

}