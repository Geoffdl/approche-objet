package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier
{
    public static void main(String[] args) throws IOException
    {

        Path pathFile = Paths.get("src/main/java/fr/diginamic/fichier/recensement.csv");
        Path outputFile = Paths.get("src/main/java/fr/diginamic/fichier/recensement_100.csv");
        // read

        System.out.println(pathFile.getFileName());

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        List<String> first100Lines = new ArrayList<>();

        //header line
        first100Lines.add(lines.get(0));

        //first 100 entries
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(lines.get(i));
            first100Lines.add(lines.get(i));

        }
        Files.write(outputFile, first100Lines, StandardCharsets.UTF_8);
        System.out.println("\nNew file created: " + outputFile.getFileName());

    }
}