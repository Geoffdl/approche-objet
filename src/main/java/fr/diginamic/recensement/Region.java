package fr.diginamic.recensement;

import java.util.HashMap;

public class Region
{

    public static HashMap<String, Integer> getRegionPopulation(Recensement recensement)
    {
        HashMap<String, Integer> mapRegionPopulation = new HashMap<>();

        for (Ville ville : recensement.getVilles())
        {
            String region = ville.getRegion();

            mapRegionPopulation.merge(
                    region,
                    ville.getPopulationTotal(),
                    Integer::sum);
        }

        return mapRegionPopulation;
    }

}