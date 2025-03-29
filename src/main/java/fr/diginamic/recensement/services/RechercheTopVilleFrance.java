package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;
import fr.diginamic.recensement.utils.ComparatorPopulation;

import java.util.List;
import java.util.Scanner;

public class RechercheTopVilleFrance extends MenuService
{
    /**
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        List<Ville> villes = recensement.getVilles();

        ComparatorPopulation comparatorPopulation = new ComparatorPopulation();
        villes.sort(comparatorPopulation);


        if (villes.isEmpty())
        {
            System.out.println("Le pays est vide ..(?)");
        } else
        {
            System.out.println("Top 10 villes les plus peuplées de france");
            for (int i = 0; i < 10 && i < villes.size(); i++)
            {
                Ville ville = villes.get(i);
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