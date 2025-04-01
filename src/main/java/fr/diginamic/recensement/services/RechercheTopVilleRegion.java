package fr.diginamic.recensement.services;

import fr.diginamic.recensement.model.Recensement;
import fr.diginamic.recensement.model.Ville;
import fr.diginamic.recensement.utils.ComparatorPopulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RechercheTopVilleRegion extends MenuService
{
    /**
     * Recherche les 10 villes les plus peuplées dans une région donnée
     *
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        scanner.nextLine();

        System.out.print("Veuillez entrer le nom de la région : ");
        String nomRegion = scanner.nextLine().trim();

        // init liste à trier
        List<Ville> villesRegion = new ArrayList<>();
        for (Ville ville : recensement.getVilles())
        {
            if (ville.getRegion().equals(nomRegion))
            {
                villesRegion.add(ville);
            }
        }

        ComparatorPopulation comparatorPopulation = new ComparatorPopulation();
        villesRegion.sort(comparatorPopulation);


        if (villesRegion.isEmpty())
        {
            System.out.println("Région non trouvée.");
        } else
        {
            System.out.printf("Top 10 villes les plus peuplées de %s:%n", nomRegion);
            for (int i = 0; i < 10 && i < villesRegion.size(); i++)
            {
                Ville ville = villesRegion.get(i);
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