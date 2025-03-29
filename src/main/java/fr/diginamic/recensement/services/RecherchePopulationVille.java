package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService
{
    /**
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner)
    {
        {
            scanner.nextLine();
            System.out.print("Veuillez entrer le nom de la ville recherchée :");
            String nomVille = scanner.nextLine();

            System.out.println("Vous Recherchez la population de: " + nomVille);
            int population = 0;
            for (Ville ville : recensement.getVilles())
            {
                if (ville.getCommuneNom().equals(nomVille))
                {
                    population = ville.getPopulationTotal();
                    break;
                }
            }

            if (population > 0)
            {
                System.out.printf("Population de %s %,d habitants \n",
                        nomVille, population);
            } else
            {
                System.out.println(nomVille + " : Ville non trouvée.");
            }
        }
    }
}