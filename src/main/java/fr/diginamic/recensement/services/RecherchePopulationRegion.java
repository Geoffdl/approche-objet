package fr.diginamic.recensement.services;

import fr.diginamic.recensement.model.Recensement;
import fr.diginamic.recensement.model.Region;

import java.util.HashMap;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService
{
    /**
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();
        HashMap<String, Integer> mapRegions = Region.getRegionPopulation(recensement);

        // Ask for the region
        System.out.print("Veuillez entrer le nom de la région recherchée : ");

        String nomRegion = scanner.nextLine().trim();

        // Get and display the population
        Integer population = mapRegions.get(nomRegion);
        if (population != null)
        {
            System.out.printf("Population de la région %s: %,d habitants%n",
                    nomRegion, population);
        } else
        {
            System.out.println("Région non trouvée.");
            // Optionally show available regions
            System.out.println("Régions disponibles :");
            mapRegions.keySet().forEach(System.out::println);
        }

        System.out.println("\nAppuyez sur Entrée pour continuer...");
        scanner.nextLine();
    }


}