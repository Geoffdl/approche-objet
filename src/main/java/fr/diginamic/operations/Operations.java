package fr.diginamic.operations;

public class Operations {
    public Operations() {}

    public static double calcul(double a, double b, char operator){

        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b != 0 ? a / b : Double.NaN;
            default -> a;
        };
    }

}