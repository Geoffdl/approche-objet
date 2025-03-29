package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;
import fr.diginamic.recensement.utils.MenuDisplay;
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

        // init dataset
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement(villes);

        // init choice logic
        MenuService service;

        while (true)
        {
            MenuDisplay.display();
            int choix = scanner.nextInt();

            switch (choix)
            {
                case 1:
                    service = new RecherchePopulationVille();
                    service.traiter(recensement, scanner);
                    break;
                case 2:
                    service = new RecherchePopulationDepartement();
                    service.traiter(recensement, scanner);
                    break;
                case 3:
                    service = new RecherchePopulationRegion();
                    service.traiter(recensement, scanner);
                    break;
                case 4:
                    service = new AffichageTopRegions();
                    service.traiter(recensement, scanner);
                    break;
                case 5:
                    service = new AffichageTopDepartements();
                    service.traiter(recensement, scanner);
                    break;
                case 6:
                    service = new RechercheTopVilleDepartement();
                    service.traiter(recensement, scanner);
                    break;
                case 7:
                    service = new RechercheTopVilleRegion();
                    service.traiter(recensement, scanner);
                    break;
                case 8:
                    service = new RechercheTopVilleFrance();
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