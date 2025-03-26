package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double a = 10;
        double b = 100;
        char op1 = '+';
        char op2 = '-';
        char op3 = '/';
        char op4 = '*';

        double resultSum = Operations.calcul(a, b, op1);
        double resultSub = Operations.calcul(a, b, op2);
        double resultDiv = Operations.calcul(a, b, op3);
        double resultMult = Operations.calcul(a, b, op4);

        System.out.println("add: " + resultSum);
        System.out.println("sub: "+resultSub);
        System.out.println("div: "+ resultDiv);
        System.out.println("mult: "+resultMult);
    }
}