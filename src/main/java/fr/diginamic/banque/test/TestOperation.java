package fr.diginamic.banque.test;

import fr.diginamic.banque.Credit;
import fr.diginamic.banque.Debit;
import fr.diginamic.banque.Operation;

import java.util.Objects;

/*
a. créez un tableau d’opérations avec au moins 4 opérations de crédits et de débits
dans le tableau.
2
b. Faites une boucle sur le tableau d’opérations pour afficher les informations
suivantes :
i. la date de l’opération
ii. le montant de l’opération
5) Dans la classe Operation, ajoutez la méthode abstraite suivante : String getType()
a. Redéfinissez cette méthode dans la classe Credit pour qu’elle retourne « CREDIT »
b. Redéfinissez cette méthode dans la classe Debit pour qu’elle retourne « DEBIT »
6) Modifiez la boucle précédente et affichez également le type des opérations.
7) Calculez enfin le montant global de toutes les opérations :
a. si c’est une opération au débit utilisez l’opérateur « – » pour le calcul.
b. si c’est une opération au crédit, utilisez l’opérateur « + » pour le calcul.
 */

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];

        operations[0] = new Credit("2024-03-25", 100.0);
        operations[1] = new Debit("2024-03-25", 100.0);
        operations[2] = new Credit("2024-03-26", 1500.0);
        operations[3] = new Debit("2024-03-26", 1000.0);

        double balance = 0;

        /* //"if else itude" == not recommended
        for (Operation operation : operations) {
            System.out.println(operation);
            if(Objects.equals(operation.getType(), "Debit")){
                balance -= operation.getAmount();
            } else {
                balance += operation.getAmount();
            }
        }*/

        for (Operation operation : operations) {
            System.out.println(operation);
            balance = operation.calcBalance(balance);
        }

        System.out.println("\nFinal balance is " + balance + "\u20AC");
    }
}