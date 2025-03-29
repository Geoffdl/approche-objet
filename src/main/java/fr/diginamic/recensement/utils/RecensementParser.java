package fr.diginamic.recensement.utils;

import fr.diginamic.recensement.Ville;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RecensementParser
{
    public static List<Ville> parse(String filePath) throws IOException
    {
        List<Ville> villes = new ArrayList<>();
        Path pathFile = Paths.get(filePath);

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        String[] tokens;

        // Skip header
        for (int i = 1; i < lines.size(); i++)
        {
            String line = lines.get(i);
            tokens = line.split(";");

            Ville ville = new Ville(
                    Integer.parseInt(tokens[0]),  // codeRegion
                    tokens[1].trim().replace(" ", ""),  // nomRegion
                    tokens[2].trim().replace(" ", ""),  // codeDepartement
                    Integer.parseInt(tokens[3]),  // codeCommune
                    tokens[6].trim(),  // nomCommune
                    Integer.parseInt(tokens[9].trim().replace(" ", ""))); // population

            villes.add(ville);
        }
        return villes;
    }
}