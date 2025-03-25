package fr.diginamic.encapsulation;

import static java.lang.Integer.MAX_VALUE;

public class TestCompte {
    public static void main(String[] args) {


        Compte jbezosAccount = new Compte(1,21283090);

        jbezosAccount.setNumeroCompte(20);
        jbezosAccount.setSoldeCompte(MAX_VALUE);

        System.out.println(jbezosAccount.getNumeroCompte()+ " " + jbezosAccount.getSoldeCompte());

    }
}