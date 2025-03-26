package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

import java.util.Arrays;

public class TestMoyenne {
    public static void main(String[] args) {

        System.out.println("Test 1:");
        CalculMoyenne calc1 = new CalculMoyenne();
        calc1.setArrayOfDouble(10.5);
        calc1.setArrayOfDouble(20.5);
        calc1.setArrayOfDouble(30.0);

        System.out.println("Tableau: " + Arrays.toString(calc1.getArrayOfDouble()));
        System.out.printf("Moyenne: %.2f%n", calc1.calcul());


        System.out.println("\nTest 2:");
        CalculMoyenne calc2 = new CalculMoyenne();
        calc2.setArrayOfDouble(-5.5);
        calc2.setArrayOfDouble(5.5);
        calc2.setArrayOfDouble(0.0);
        calc2.setArrayOfDouble(10.0);

        System.out.println("Tableau: " + Arrays.toString(calc2.getArrayOfDouble()));
        System.out.printf("Moyenne: %.2f%n", calc2.calcul());
    }
}