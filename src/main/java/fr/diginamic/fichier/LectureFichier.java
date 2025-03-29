package fr.diginamic.fichier;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier
{
    public static void main(String[] args) throws IOException
    {
        // init list for storage purpose
        ArrayList<Ville> cities = new ArrayList<>();


        //source file
        Path pathFile = Paths.get("src/main/java/fr/diginamic/fichier/recensement.csv");

        System.out.println(pathFile.getFileName());

        //Read content
        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
        for (String line : lines)
        {
            System.out.println(line);
        }

        //Transform content and store inside arrayList
        String[] tokens = new String[10];
        for (int i = 1; i < lines.size(); i++)
        {
            String line = lines.get(i);
            tokens = line.split(";");

            String population = tokens[9].trim().replace(" ", "");

            Ville ville = new Ville(
                    tokens[6].trim().replace(" ", ""),
                    tokens[2].trim(),
                    tokens[1].trim(),
                    Integer.parseInt(population)
            );
            cities.add(ville);
        }

        // target file
        Path outputFile = Paths.get("src/main/java/fr/diginamic/fichier/recensement_popAbove25k.csv");

        // formated list from array
        List<String> outputLines = new ArrayList<>();

        //header
        outputLines.add(lines.getFirst());

        for (Ville city : cities)
        {
            String cityLine = String.format("%s;%s;%s;%d",
                    city.getName(),
                    city.getDptCode(),
                    city.getRegionName(),
                    city.getPopulation());
            outputLines.add(cityLine);
        }

        // append formated body
        Files.write(outputFile, outputLines, StandardCharsets.UTF_8);
    }
}