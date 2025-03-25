package fr.diginamic.entites;


public class TestAdressePostale {
    public static void main(String[] args) {

/* Exemple "à l'ancienne"
        AdressePostale adr1 = new AdressePostale();
        AdressePostale adr2 = new AdressePostale();

        adr1.numeroRue = 5;
        adr1.libelleRue = "Rue des tomates";
        adr1.ville = "Paris";
        adr1.codePostal = 75017;

        adr2.numeroRue = 5;
        adr2.libelleRue = "Rue des tomates";
        adr2.ville = "Paris";
        adr2.codePostal = 75017;
*/

        AdressePostale adr1 = new AdressePostale(5, "Rue des tomates", "Paris", 75017);
        AdressePostale adr2 = new AdressePostale(5, "Rue des tomates", "Paris", 75017);
    }

}