package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;

import java.util.HashMap;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService
{
    /**
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        HashMap<String, Integer> departements = Departement.getDepartementPopulation(recensement);

        System.out.print("Veuillez entrer le code département : ");
        String codeDep = scanner.nextLine().trim();

        Integer population = departements.get(codeDep);

        if (population != null)
        {
            System.out.printf("Population du département %s: %,d habitants%n",
                    codeDep, population);
        } else
        {
            System.out.println("Département non trouvé.");
        }

        System.out.println("\nAppuyez sur Entrée pour continuer...");
        scanner.nextLine();
    }
}