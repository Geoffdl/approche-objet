package fr.diginamic.entites;

public class TestPersonne {
    public static void main(String[] args) {

        Personne john = new Personne();
        AdressePostale johnAdresse = new AdressePostale();

        john.prenom = "John";
        john.nom = "Dude";

        johnAdresse.libelleRue = "La rue";
        johnAdresse.ville = "Paris";
        johnAdresse.numeroRue = 8;
        johnAdresse.codePostal = 75018;


    }
}