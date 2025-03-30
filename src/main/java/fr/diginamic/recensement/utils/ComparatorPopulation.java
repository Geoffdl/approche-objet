package fr.diginamic.recensement.utils;

import fr.diginamic.recensement.model.Ville;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<Ville>
{
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Ville o1, Ville o2)
    {
        return Integer.compare(o2.getPopulationTotal(), o1.getPopulationTotal());
    }
}