package fr.diginamic.recensement.model;

import java.util.List;

public class Recensement
{
    private List<Ville> villes;

    public Recensement(List<Ville> villes)
    {
        this.villes = villes;
    }

    public List<Ville> getVilles()
    {
        return villes;
    }
}