package fr.diginamic.pays;

import java.util.StringJoiner;

public class Pays {
    public String nom;
    public int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pays.class.getSimpleName() + "[", "]")
                .add("nom='" + nom + "'")
                .add("population=" + population)
                .toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pays pays = (Pays) obj;
        return population == pays.population &&
                nom.equals(pays.nom);
    }

}