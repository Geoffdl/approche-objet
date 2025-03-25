package fr.diginamic.entites2;

import fr.diginamic.entites.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

}