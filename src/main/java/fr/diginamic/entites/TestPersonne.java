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

        Personne john = new Personne("Dude", "John", null);

        AdressePostale adresse = new AdressePostale(8, "La rue", "Paris", 75017);

        Personne p2 = new Personne("Uo","yi", new AdressePostale(8, "La rue", "Paris", 75017) ); // pas conseillé

        john.getNomPrenom();

        john.setNom("Smith");
        john.setPrenom("Jane");

        john.getNomPrenom();

        System.out.println(john.getNom());
        System.out.println(john.getPrenom());

        System.out.println(adresse);
        john.getAdresse();

        adresse = new AdressePostale(10, "rue Example", "Ville", 12345);
        john.setAdresse(adresse);

        john.getAdresse();
        System.out.println(adresse);


    }
}