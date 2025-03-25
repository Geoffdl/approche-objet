package fr.diginamic.entites;

import fr.diginamic.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        /*
        Personne john = new Personne();
        AdressePostale johnAdresse = new AdressePostale();

        john.prenom = "John";
        john.nom = "Dude";

        johnAdresse.libelleRue = "La rue";
        johnAdresse.ville = "Paris";
        johnAdresse.numeroRue = 8;
        johnAdresse.codePostal = 75018;
        */

        AdressePostale adresse = new AdressePostale(8, "La rue", "Paris", 75017);

        Personne john = new Personne("Dude", "John", adresse);


    }
}