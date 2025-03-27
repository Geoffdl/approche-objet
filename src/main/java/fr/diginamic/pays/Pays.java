package fr.diginamic.pays;

import java.util.Objects;
import java.util.StringJoiner;

public class Pays
{
    private int id; // generalement un id est ajouté aux classes, il est unique
    public String nom;
    public int population;

    public Pays(String nom, int population)
    {
        this.nom = nom;
        this.population = population;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Pays.class.getSimpleName() + "[", "]")
                .add("nom='" + nom + "'")
                .add("population=" + population)
                .toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Pays autre)
        {
            return Objects.equals(this.nom, autre.getNom()) && this.population == autre.getPopulation();
        }
        return false;
    }


}