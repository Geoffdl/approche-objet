package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;
import fr.diginamic.recensement.utils.ComparatorPopulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RechercheTopVilleDepartement extends MenuService
{
    /**
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        System.out.print("Veuillez entrer le code du départment : ");
        String codeDepartement = scanner.nextLine().trim();

        // init liste à trier
        List<Ville> villesDepartements = new ArrayList<>();
        for (Ville ville : recensement.getVilles())
        {
            if (ville.getCodeDepartement().equals(codeDepartement))
            {
                villesDepartements.add(ville);
            }
        }

        ComparatorPopulation comparatorPopulation = new ComparatorPopulation();
        villesDepartements.sort(comparatorPopulation);

        if (villesDepartements.isEmpty())
        {
            System.out.println("Département non trouvé.");
        } else
        {
            System.out.printf("Top 10 villes les plus peuplées de %s:%n", codeDepartement);
            for (int i = 0; i < 10 && i < villesDepartements.size(); i++)
            {
                Ville ville = villesDepartements.get(i);
                System.out.printf("%d. %s: %,d habitants%n",
                        i + 1,
                        ville.getCommuneNom(),
                        ville.getPopulationTotal());
            }
        }

        System.out.println("\nAppuyez sur Entrée pour continuer...");
        scanner.nextLine();
    }
}