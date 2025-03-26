package fr.diginamic.encapsulation;

import static java.lang.Integer.MAX_VALUE;

public class TestBanque {
    public static void main(String[] args) {


        Compte jbezosAccount = new Compte(1,21283090);

        jbezosAccount.setNumeroCompte(20);
        jbezosAccount.setSoldeCompte(MAX_VALUE);

        System.out.println(jbezosAccount.getNumeroCompte()+ " " + jbezosAccount.getSoldeCompte());

        System.out.println(jbezosAccount);

        Compte[] cptArray = new Compte[2];

        cptArray[0] = new Compte(12345, 2839283);
        cptArray[1] = new CompteTaux(12346, 2883,222);

        for(Compte cpt : cptArray){
            System.out.println(cpt);
        }
    }

}