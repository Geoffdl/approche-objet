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

        operations[0] = new Credit("2024-03-25", 150.0);  // date, amount
        operations[1] = new Debit("2024-03-25", 50.0);
        operations[2] = new Credit("2024-03-26", 200.0);
        operations[3] = new Debit("2024-03-26", 175);

        double sum = 10.0;
        for (Operation operation : operations) {
            System.out.println(operation.getType() + " " + operation.getDate() + " " + operation.getAmount());
            if(Objects.equals(operation.getType(), "Debit")){
                sum -= operation.getAmount();
            } else {
                sum += operation.getAmount();
            }
        }
        System.out.println("\nTotal for the day is " + sum + "\u20AC");
    }
}