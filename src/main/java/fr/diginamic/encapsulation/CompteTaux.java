package fr.diginamic.encapsulation;

import java.util.StringJoiner;

public class CompteTaux extends Compte{

    private int tauxRemuneration;

    public CompteTaux(int numeroCompte, int soldeCompte, int tauxRemuneration) {
        super(numeroCompte, soldeCompte);

        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + ", tauxRemuneration=" + tauxRemuneration;
    }
}