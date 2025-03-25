package fr.diginamic.entites;


public class AdressePostale {

    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    public AdressePostale(int numeroRue, String libelleRue, String ville, int codePostal) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.ville = ville;
        this.codePostal = codePostal;

    }


}