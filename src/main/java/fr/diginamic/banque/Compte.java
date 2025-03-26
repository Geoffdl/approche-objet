package fr.diginamic.banque;

import java.util.StringJoiner;

/*
1) Créez un module encapsulation.py
2) Dans ce module créez la classe Compte en respectant les règles de
l’encapsulation des attributs:
a. la classe Compte a 2 attributs d’instance :
i. le numéro de compte
ii. le solde du compte
b. un constructeur avec le numéro de compte et le solde.
c. Les getters / setters sous la forme de properties
3) Créez une instance de Compte
4) Modifiez le numéro de solde et le numéro de compte en utilisant les setters
5) Affichez les attributs du compte en utilisant les getters.
 */
public class Compte
{
    private int numeroCompte;
    private int soldeCompte;


    public Compte(int numeroCompte, int soldeCompte)
    {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte()
    {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte)
    {
        this.numeroCompte = numeroCompte;
    }

    public int getSoldeCompte()
    {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte)
    {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Compte.class.getSimpleName() + "[", "]")
                .add("numeroCompte=" + numeroCompte)
                .add("soldeCompte=" + soldeCompte)
                .toString();
    }


}