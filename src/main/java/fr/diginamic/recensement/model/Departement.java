package fr.diginamic.recensement.model;

import java.util.HashMap;

public class Departement
{
    public static HashMap<String, Integer> getDepartementPopulation(Recensement recensement)
    {
        HashMap<String, Integer> mapDepartementPopulation = new HashMap<>();

        for (Ville ville : recensement.getVilles())
        {
            String codeDep = ville.getCodeDepartement();

            mapDepartementPopulation.merge(
                    codeDep,
                    ville.getPopulationTotal(),
                    Integer::sum);
        }

        return mapDepartementPopulation;
    }
}