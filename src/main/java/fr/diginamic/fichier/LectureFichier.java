package fr.diginamic.fichier;

import fr.diginamic.lists.Ville;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        Path pathFile = Paths.get("src/main/java/fr/diginamic/fichier/recensement.csv");
        ArrayList<Ville> cities = new ArrayList<>();


        System.out.println(pathFile.getFileName());

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        /*
        for (String line : lines) {
            System.out.println(line);
        }
         */
        String[] tokens = new String[10];


        for (int i = 1; i < 10; i++) {
            /*System.out.println(lines.get(i));
            first100Lines.add(lines.get(i));*/

            String line = lines.get(i);
            tokens = line.split(";");

            System.out.println("Line " + i + " tokens:");
            System.out.println("City: " + tokens[6]);
            System.out.println("Department: " + tokens[2]);
            System.out.println("Region: " + tokens[1]);
            System.out.println("Population: " + tokens[9]);
            System.out.println("-------------------");

            String population = tokens[9].trim().replace(" ", "");

            Ville ville = new Ville(
                    tokens[6].trim(),
                    Integer.parseInt(tokens[2].trim()),
                    tokens[1].trim(),
                    Integer.parseInt(population)
            );
            cities.add(ville);
        }

        System.out.println(cities);


    }
}