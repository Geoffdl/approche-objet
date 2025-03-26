package fr.diginamic.lists;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville>
{
    @Override
    public int compare(Ville o1, Ville o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}