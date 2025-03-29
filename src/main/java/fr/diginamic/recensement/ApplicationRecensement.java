package fr.diginamic.recensement;

import fr.diginamic.recensement.services.RecherchePopulationVille;
import fr.diginamic.recensement.utils.RecensementParser;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement
{
    public static void main(String[] args) throws IOException
    {
        // Read and parse the CSV file
        String pathFile = "src/main/java/fr/diginamic/fichier/recensement.csv";
        List<Ville> villes = RecensementParser.parse(pathFile);


        // Create the Recensement object
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement(villes);


        while (true)
        {
            System.out.println("\n1. Rechercher la population d'une ville");
            System.out.println("2. ...");
            System.out.println("9. Quitter");

            System.out.print("\nVotre choix: ");
            int choix = scanner.nextInt();

            switch (choix)
            {
                case 1:
                    MenuService service = new RecherchePopulationVille();
                    service.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
            }
        }
    }
}