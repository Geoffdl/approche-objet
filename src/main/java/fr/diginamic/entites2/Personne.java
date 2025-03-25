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

    public void getNomPrenom() {
        String myName = this.nom.toUpperCase();
        String myFirstName = this.prenom.toUpperCase();
        System.out.println(myName + " " + myFirstName);
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public void displayAdresse(){
        System.out.println(this.adresse.numeroRue + " " + this.adresse.libelleRue + ", " + this.adresse.codePostal + " " + this.adresse.ville);
    }
    public AdressePostale getAdresse(){
        return this.adresse;
    }

}